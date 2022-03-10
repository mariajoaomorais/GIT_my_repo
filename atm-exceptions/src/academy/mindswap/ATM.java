package academy.mindswap;

import academy.mindswap.exceptions.ATMException;
import academy.mindswap.exceptions.NotEnoughFundsException;
import academy.mindswap.exceptions.NotEnoughPermissionsException;

public class ATM {

    private String name;
    private Card card;
    private boolean correctPIN;

    public ATM(String name) {
        this.name = name;
        this.card = null;
        this.correctPIN = false;
    }

    public void insertCard(Card card) {
        if (this.card == null) {
            this.card = card;
            System.out.println("Card read successfully.");
            return;
        }
        System.out.println("This ATM machine already has a card.");
    }

    public void removeCard(Card card) {

        if (this.card == card) {
            this.card = null;
            System.out.println("Thank you for using this ATM machine.");
            this.correctPIN = false;
            return;
        }
        if (this.card == null) {
            System.out.println("This ATM machine does not have a card.");
        }

        System.out.println("This card is not inside this ATM machine.");
    }

    public void introducePin_(int pin) throws ATMException {

        if (this.card == null) {
            throw new ATMException("You have to insert your card first");
        }

        if (pin == this.card.getPin()) {
            System.out.println("Correct PIN");
            this.correctPIN = true;
            return;
        }
        ATMException error = new NotEnoughPermissionsException();
        throw error;
    }

    public void withdraw_(int amount) throws ATMException {

        if (this.card == null) {
            throw new ATMException("You have to insert your card first");
        }

        if (this.correctPIN) {

            if (this.card.getBalance() >= amount) {
                this.card.setBalance(this.card.getBalance() - amount);
                System.out.println("Withdrawal successful");
                return;
            }
            ATMException error = new NotEnoughFundsException();
            throw error;
        }

        ATMException error = new NotEnoughPermissionsException();
        throw error;
    }

    public void introducePin(int pin) {
        try {
            this.introducePin_(pin);
        } catch (ATMException e) {
            System.out.println(e.getMessage());
            return;

        } finally {
            System.out.println("Introduce PIN - This will always happen, regardless of an exception being thrown or not");
        }
    }

    public void withdraw(int amount) {
        try {
            this.withdraw_(amount);
        } catch (ATMException e) {
            System.out.println(e.getMessage());
            return;

        } finally {
            System.out.println("Withdraw - This will always happen, regardless of an exception being thrown or not");
        }
    }
}

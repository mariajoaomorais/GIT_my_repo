package academy.mindswap;

import academy.mindswap.exceptions.ATMException;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM("CGD");

        Card card = Card.askForNewCard();
        Card card2 = Card.askForNewCard();

        card.getCardDetails();
        card2.getCardDetails();

        atm.insertCard(card);
        atm.insertCard(card2);



        try{
            atm.introducePin_(1001);
        } catch (ATMException e){
            System.out.println(e.getMessage());
            return;

        } finally {
            System.out.println("Introduce PIN - This will always happen, regardless of an exception being thrown or not");
        }


        try{
            atm.withdraw_(20);
        } catch (ATMException e){
            System.out.println(e.getMessage());
            return;

        } finally {
            System.out.println("Withdraw - This will always happen, regardless of an exception being thrown or not");
        }


        atm.removeCard(card);


        System.out.println();
        System.out.println("=====================================");
        System.out.println();

        atm.withdraw(20);
        atm.introducePin(1001);
        atm.insertCard(card);
        atm.introducePin(1003);
        atm.withdraw(50);
        atm.introducePin(1001);
        atm.withdraw(200);
        atm.withdraw(20);





    }
}

package academy.mindswap;

public class Card {

    private int pin;
    private double balance;
    private Client name;


    public Card(double balance) {
        this.balance = balance;
        this.pin = 0000;
    }

    public void generatePin(){
        pin = RandomGenerator.generateRandom(1000,9999);
        System.out.println("Your pin is: " + pin);
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void removeBalance(double amount){
        this.balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

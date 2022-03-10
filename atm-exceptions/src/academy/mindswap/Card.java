package academy.mindswap;

public class Card {

    private String cardNumber;
    private int pin;
    private double balance;

    public Card(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 100;
    }

    public static Card askForNewCard(){

        Card card = CardFactory.generateCard();
        return card;
    }

    public void getCardDetails(){
//        if(this == null){
//            System.out.println("You don't have a card yet");
//            return;
//        }
        System.out.println("Your card number is " + this.getCardNumber() + " and your pin is : " + this.getPin());
    }

    public void changePIN(Card card, int oldPin, int newPin){

        if(oldPin == card.getPin()){
            System.out.println("PIN changed. Your new pin is " + newPin);
            card.setPin(newPin);
            return;
        }

        System.out.println("Your PIN is not " + oldPin + ". Try again.");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

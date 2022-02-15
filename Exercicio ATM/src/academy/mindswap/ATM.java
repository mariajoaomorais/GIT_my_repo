package academy.mindswap;

public class ATM extends Service{

    private Card card;
    // private Card balance;
    // private Client client;
    //private int introducedPin;
    private boolean checkPin;
    //private double valueToWithdraw;


    public void introducedCard(Card card) {
        this.card = card;
        System.out.println("Please, introduce pin.");
    }

    public boolean introducePin(int introducedPin) {
        if(card == null){
            System.out.println("You have to introduce a card");
            return false;
        }
        if (introducedPin == card.getPin()) {
            System.out.println("Your pin is correct!");
            checkPin = true;
            return true;
        } else {
            System.out.println("Your pin is WRONG!");
            checkPin = false;
            return false;
        }
    }

    public double withdraw(double valueToWithdraw) {

        if(this.card == null){
            System.out.println("You have to introduce a card");
            return 0;
        }
        if (checkPin) {
            if (card.getBalance() >= valueToWithdraw) {
                card.removeBalance(valueToWithdraw);
                System.out.println("Catch your money. Your actual balance is: " +  card.getBalance());
                checkPin=false;
                return valueToWithdraw;
            }

            checkPin=false;
            System.out.println("Sorry, you don't have enough money!");
            return 0;

        }

        System.out.println("You have to introduce the correct pin!");
        return 0;

    }

    public void whatIsTheBalanceCard() {
        double actualBalance = card.getBalance();
        System.out.println("Your actual balance is: " + actualBalance);
    }


}

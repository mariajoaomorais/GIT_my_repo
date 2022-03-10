package academy.mindswap;

public class Main {

    public static void main(String[] args) {


        Client client = new Client ("John");
        System.out.println("Hello " + client + " !");

        Card card = new Card(100.0);

        //card.generatePin();
        ATM atm = new ATM();

        client.withdraw(100);
        client.use(atm, 0000);

        client.orderNewCard(10000);
        client.orderNewCard(1231231);
        client.use(atm, 0100);
        client.withdraw(700);
        client.use(atm, 0000);
        client.withdraw(700);
        client.use(atm, 0000);
        client.withdraw(200);


        Shop shop = new Shop();
        client.use(shop);
        client.buyProduct(ProductType.MEAT);
        client.pay();

        /*  atm.introducedCard(card);
        atm.introducePin(1234);
        atm.introducePin(0000);
        atm.whatIsTheBalanceCard();
        atm.withdraw(50);
        +/

       /*
        client.withdraw(atm,100);
            atm.introduceCard(card);
            atm.introducePin(pin);
            atm.withdraw(100);

        client.checkBalance(atm);
            if(validateATM(atm)){
                atm.introduceCard();
            }

        */
    }
}

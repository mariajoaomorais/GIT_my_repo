package academy.mindswap;

public class Client {

    private String name;
    private Service service;
    private Card card;
    private double wallet=0;

    public Client(String name) {
        this.name = name;
    }

    public void use(Service atm, int pin){
        this.service = atm;
        ((ATM) this.service).introducedCard(card);
        ((ATM) this.service).introducePin(pin);
    }

    public void use(Service shop){
        this.service = shop;
    }

    public void pay(){
        if(service == null || !(service instanceof Shop)){
            System.out.println("You are not at a Shop");
            return;
        }
        ((Shop) service).pay(wallet);
    }

    public void withdraw(double amount) { //so faz sentido se for ATM
        if(service == null || !(service instanceof ATM)){
            System.out.println("You are not at an ATM");
            return;
        }
       wallet = wallet + ((ATM) service).withdraw(amount);
       System.out.println("Your wallet have this money: " + wallet);
    }

    public void orderNewCard(int amount){
     if(this.card == null){
         this.card = CardFactory.createNewCard(amount);
         System.out.println("You have a new card.");
         return;
     }
        System.out.println("You already have a card");
    }

    public int orderNewPin(){
        return 1;
    }

    public String getName() {
        return name;
    }


    public void buyProduct(ProductType productType) {
        if(service == null || !(service instanceof Shop)){
            System.out.println("You are not at a Shop");
            return;
        }
        ((Shop ) service).buyProduct(productType);
    }

    public void setWallet(double rest) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }
}

package academy.mindswap;

public class Shop extends Service{

    private double accountToPay =0;
    private boolean isClientPayed;
    private Client client;



    public int buyProduct(ProductType productType) {
        ProductType price;

        switch(productType){
            case MEAT -> productType.getPrice();
        }



        System.out.println("buying " + productType);
        double price = productType.getPrice();
        accountToPay += price;
        System.out.printf("You have to pay %d.", price);
    }

    public void pay(double wallet){
        this.accountToPay = accountToPay;
        double money= client.getWallet();
        double rest;


        if(money >= accountToPay){
            rest=money-accountToPay;
            client.setWallet(rest);
        }
        System.out.printf("You paid in the shop with %d and keep the change %d .", money, accountToPay);
    }

}

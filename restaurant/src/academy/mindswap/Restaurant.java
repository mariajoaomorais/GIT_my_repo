package academy.mindswap;

public class Restaurant {

    //Propriedades da classe
    private static int restaurantCount = 0;

    //Propriedades do objeto Restaurante
    private int numberMaxOfTables;
    private String restaurantName;
    private int numberOfocupiedTables;

    public Restaurant(String restaurantName, int numberMaxOfTables) {
        this restaurantName = restaurantName;
        this.numberMaxOfTables = numberMaxOfTables;
        restaurantCount++;
    }

    public void sitClient(Table client){
        if(numberMaxOfTables == numberOfocupiedTables){
            System.out.println("Sorry...No available tables!");
        } else{
            System.out.println("Welcome " + client.getClientName().getClientName() + " Please come in and make your order!");
            numberOfocupiedTables ++;
        }
    }

    public void checkOutClient(Table table){
        if(table.isHasClientPayed()){
            System.out.println("Thank You!Come back soon!");
            numberOfocupiedTables--;
        }else{
            System.out.println("Sorry, but before leaving you have to pay!");
        }
    }
}

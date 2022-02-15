package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CoffeeShop coffeeShop = new CoffeeShop();

        Drink myDrink = coffeeShop.serveDrink(DrinkTypeEnum.MOCHA_ENUM);
        //Drink myDrink = coffeeShop.serveDrink("macchiato"); //Sem considerar ter DrinkType

        Drink myDrink3 = coffeeShop.serveDrink(DrinkTypeEnum.MACCHIATO_ENUM);
        System.out.println(myDrink.toString());

        DrinkTypeEnum[] drinkTypeEnums= DrinkTypeEnum.values();
        for(DrinkTypeEnum drinkTypeEnum : drinkTypeEnums){
            System.out.println(drinkTypeEnum.toString());
            System.out.println(drinkTypeEnum.getIngredients());
        }

    }
}

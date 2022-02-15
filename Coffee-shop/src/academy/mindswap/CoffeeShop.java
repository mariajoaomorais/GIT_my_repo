package academy.mindswap;

public class CoffeeShop {

    public Drink serveDrink(DrinkTypeEnum drink) {
/*
        switch (drink) {
            case MACCHIATO_ENUM:
                return new Drink(drink.getIngredients());
            case MOCHA_ENUM:
                return new Drink(drink.getIngredients());
            case FRAPUCCINO_ENUM:
                return new Drink(drink.getIngredients());
            default:
                return new Drink(D");
        }
    }

 */
    public Drink serveDrink(DrinkTypeEnum drink) {
        if (DrinkTypeEnum.MACCHIATO_ENUM.equals(drink)) {                //podia ser DrinkType.MACCHIATO_DT == drink
            return new Drink("coffe, milk,sugar");
        }
        if (DrinkTypeEnum.MOCHA_ENUM.equals(drink)) {
            return new Drink("coffee, chocolate syrup, milk,sugar");
        }
        return new Drink("water");
    }


}

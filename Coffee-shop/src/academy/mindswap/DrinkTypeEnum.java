package academy.mindswap;

public enum DrinkTypeEnum {
    WATER_ENUM("water"),
    MACCHIATO_ENUM("coffee, milk"),
    MOCHA_ENUM("coffee, chocolate syrup, milk"),
    FRAPUCCINO_ENUM("coffee, milk, ice, caramel syrup");
                      //Separador por virgulas e no final ponto e virgula

    private String ingredients;

    private DrinkTypeEnum(String ingredients){
        this.ingredients = ingredients;
    }


}

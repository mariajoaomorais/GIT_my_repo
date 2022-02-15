package academy.mindswap;

public class DrinkType {
  /*  public static final String WATER = "water";
    public static final String MACCHIATO = "Macchiato";
    public static final String MOCHA = "Mocha";
    public static final String FRAPUCCINO = "Frapuccino";
    */

    public static final DrinkType MACCHIATO_DT = new DrinkType("coffee, milk");
    public static final DrinkType MOCHA_DT = new DrinkType("coffee, chocolate syrup, milk");
    public static final DrinkType FRAPUCCINO_DT = new DrinkType("coffee, milk, ice, caramel syrup");
    public static final DrinkType WATER_DT = new DrinkType("water");

    private String ingredients;

    private DrinkType(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }
}

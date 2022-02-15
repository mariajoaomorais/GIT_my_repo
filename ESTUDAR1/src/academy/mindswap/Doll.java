package academy.mindswap;

public class Doll {

    //Propriedades de objecto boneca
    //Cada objecto boneca tem estas propriedades
    private String name;
    private String hairColor;
    private String dressColor;
    private int counter;

    //Propriedades da class boneca
    private static int numberOfDollsCreated;
    private static int numberOfDollsCreatedWithBlueDress;

    //Construtor
    public Doll(String name, String hairColor, String dressColor){
        this.name = name;
        this.hairColor= hairColor;
        this.dressColor= dressColor;
        counter++;
        Doll.updateNumberOfDolls(dressColor); //Sempre que criamos uma boneca actualizamos os contadores
    }                                         //passamos como parametro a cor do vestido

    private static void updateNumberOfDolls(String dressColor) {
        Doll.numberOfDollsCreated++;

        if (dressColor.equalsIgnoreCase("blue")) {
            Doll.numberOfDollsCreatedWithBlueDress++;
        }
    }

    //Getters & Setters

    public static int getNumberOfDollsCreated() {
        return numberOfDollsCreated;
    }

    public static int getNumberOfDollsCreatedWithBlueDress() {
        return numberOfDollsCreatedWithBlueDress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getDressColor() {
        return dressColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }
}

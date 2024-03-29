package academy.mindswap;

public class Doll {
    private static int numberOfDollsCreated;
    private static int numberOfDollsCreatedWithBlueEyes;

    private String skinTone;
    private String hairColor;
    private String eyeColor;
    private String name;
    private int counter;


    public Doll (String skinTone, String hairColor, String eyeColor, String name){
        this.skinTone = skinTone;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
        counter++;
        Doll.updateNumberOfDollsCreated(eyeColor);
    }

    public static void updateNumberOfDollsCreated(String eyeColor){
        Doll.incrementNumberOfDollsCreated();
        if (eyecolor.equalsIgnoreCase("blue")){
            Doll.numberOfDollsCreatedWithBlueEyes++;
        }

    private static void incrementNumberOfDollsCreated() {
        Doll.numberOfDollsCreated++;

    }
    public  int getNumberOfDollsCreated() {
        return numberOfDollsCreated;
    }

    public static int getNumberOfDollsCreated() {
        return numberOfDollsCreated;
    }

    private static int getNumberOfDollsCreatedWithBlueEyes() {
        return numberOfDollsCreatedWithBlueEyes;
    }

    public String getSkinTone(){
        return skinTone;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getName(){
        return name;
    }

}

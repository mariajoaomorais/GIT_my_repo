package academy.mindswap;

public class Doll {

    private static int numberOfDollsCreated;
    private static int numberOfDollsCreatedWithBlueEyes;

    private String skinTone;
    private String hairColor;
    private String eyeColor;
    private String name;

    public Doll (String skinTone, String hairColor, String eyeColor, String name){
        this.skinTone = skinTone;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
        updateNumberOfDollsCreated(this.eyeColor);
    }

    private static void updateNumberOfDollsCreated(String eyeColor) {
        numberOfDollsCreated++;
        if (eyeColor.equalsIgnoreCase("blue")) {
            numberOfDollsCreatedWithBlueEyes++;
        }
    }
    public int getNumberOfDollsCreated() {
        return numberOfDollsCreated;
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



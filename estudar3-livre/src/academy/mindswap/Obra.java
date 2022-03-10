package academy.mindswap;

public class Obra {

    //Propriedade de cada obra
    String typeConstruction;
    int valueConstruction;

    //Propriedades da classe Obras
    private static int totalNumberOfConstructions;
    private static int totalNumberOfPublicConstructions;
    private static int totalNumberOfPrivateConstructions;
    private static int totalValueOfConstructions;

    public Obra(String typeConstruction, int valueConstruction) {
        this.typeConstruction = typeConstruction;
        this.valueConstruction = valueConstruction;

        Obra.update(typeConstruction, valueConstruction);
    }

        //Sempre que criamos uma obra nova actualizamos os contadores
        //passamos como parametro o tipo de obra

    public static void update(String typeConstruction, int valueConstruction) {
        Obra.totalNumberOfConstructions++;
        Obra.totalValueOfConstructions += valueConstruction;

        if (typeConstruction.equalsIgnoreCase("Private")){
            Obra.totalNumberOfPrivateConstructions++;
        }
        if (typeConstruction.equalsIgnoreCase("Public")) {
            Obra.totalNumberOfPublicConstructions++;
        }
    }


    //Getters anda Setters

    public static int getTotalValueOfConstructions() {
        return totalValueOfConstructions;
    }

    public static int getTotalNumberOfConstructions() {
        return totalNumberOfConstructions;
    }

    public static int getTotalNumberOfPublicConstructions() {
        return totalNumberOfPublicConstructions;
    }

    public static int getTotalNumberOfPrivateConstructions() {
        return totalNumberOfPrivateConstructions;
    }
}


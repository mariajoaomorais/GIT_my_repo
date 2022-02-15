package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Obra obras = new Obra("Private", 20000);
        Obra obras1 = new Obra("Public", 10000);

        System.out.println("N.º Total de Obras: " + Obra.getTotalNumberOfConstructions());
        System.out.println("Valor Total Obras: " + Obra.getTotalValueOfConstructions());
        System.out.println("N.º de Obras Particulares: " + Obra.getTotalNumberOfPrivateConstructions());
        System.out.println("N.º de Obras Públicas: " + Obra.getTotalNumberOfPublicConstructions());
    }

}



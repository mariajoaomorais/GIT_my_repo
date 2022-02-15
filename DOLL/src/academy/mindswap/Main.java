package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        Doll doll = new Doll("Pale", "blonde", "Blue", "Josefina");
        Doll doll1 = new Doll("Pale", "blonde", "Blue", "Josefina");
        Doll doll2 = new Doll("Pale", "blonde", "Blue", "Josefina");

        //Formas de criar uma array de Dolls:
        //Doll[] dolls = new Doll[2];
        //dolls[0] = doll;
        //dolls[1] = doll1;
        //ou
        // Doll[] dolls = {doll, doll1, doll2}

       System.out.println("Number of dolls created: " + Doll.getNumberOfDollsCreated());

       //System.out.println("Number of dolls created with bue eyes: " + Doll.);
    }
}

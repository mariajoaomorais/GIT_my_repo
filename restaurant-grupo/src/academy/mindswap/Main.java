package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Restaurant rest = new Restaurant("O Chouriço", 5);
        rest.clientIn("Manel");
        rest.clientIn("Maria");
        rest.clientIn("Quim");
        rest.clientIn("Zé");
        rest.clientIn("Alfredo");
        rest.clientIn("Joaquina");

        rest.clientOut("Manel");
        rest.clientPay("Manel");
        rest.clientOut("Manel");
        rest.clientIn("Joaquina");

    }
}

package academy.mindswap;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Calculator2 calculator = new Calculator2();

        int sum = calculator.sum(1,2);
        int subtract = calculator.subtract(4,3);
        int multiply = calculator.multiply(2,3);
        int divide = calculator.divide(6,3);

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
/*


        // ------ Exercicio 4 - STAND -------

        ArrayList cars = new ArrayList<>();
        cars.add("CArro 1");
        cars.add("CArro 2");
        cars.add("CArro 3");

        Stand stand = new Stand("O Stander", cars);
        stand.printCarNames();
        stand.buy("carro 4");
        stand.printCarNames();
        stand.sell("carro 7");
        //stand.printCarNames();
/*
        // -------- Exercicio 3 - BONECAS ---------

        Doll doll = new Doll("Toncha","blond","green");
        Doll doll1 = new Doll("Maria","roxo","blue");
        Doll doll2 = new Doll("Zequinha","azul","blue");
        Doll doll3 = new Doll("Soraia","vermelho","yellow");
        Doll doll4 = new Doll("CArlota","branco","green");

        //System.out.println("Total dolls created : " + Doll.getNumberOfDollsCreated());
        //System.out.println("Dolls created with blue dress: " + Doll.getNumberOfDollsCreatedWithBlueDress());


        // -------- Exercicio 1 - Calculadora ---------

        Calculator calculator = new Calculator();

         int sum = calculator.sum(1,2);
         int subtract = calculator.subtract(4,3);
         int multiply = calculator.multiply(2,3);
         int divide = calculator.divide(6,3);

         System.out.println(sum);
         System.out.println(subtract);
         System.out.println(multiply);
         System.out.println(divide);



        // ------ Exercicio 2 - Carros -------

        //Create a new instance of the class or object
        Car car = new Car("fiat","blue");

        //Set properties of the object
        car.fuelLevel = 100;
        car.brand = "Lada";
        car.color = "Red";


        //Method call
        car.getRefuelled();
        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);

        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);

        car.fuelLevel = 0;
        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);

        car.getRefuelled();
        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);
*/

    }

}

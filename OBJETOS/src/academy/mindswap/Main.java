package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        // Create a new instance of the class or object
        //Opção 2
        String brand = "Tata";
        String brand1 = new String("Tata");

        Car car = new Car(brand, "Fuscia", "AA27RR");
        Car car1 = new Car(brand1, "Fuscia");

        System.out.println(car.getBrand());

        //Opção inicial
        //Car car = new Car("Tata", "Fuscia");
        //Car car1 = new Car()

        //System.out.println(car.fuelLevel);
        //System.out.println(car.brand);
        //System.out.println(car.color);

        //Set the properties of the object
        //car.fuelLevel = 100;
        car.getRefuelled();
        car.brand = "Lada";
        car.color = "Red";

        //Method call
        car.accelerate();
        System.out.println("The car fuel is: " + car.fuelLevel);

        car.fuelLevel = 0;
        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);

        car.getRefuelled();
        car.accelerate();
        System.out.println("The car fuel level is: " + car.fuelLevel);
    }
}






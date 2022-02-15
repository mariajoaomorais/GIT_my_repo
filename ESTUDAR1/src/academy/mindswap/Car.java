package academy.mindswap;

public class Car {

    //State
    String brand;
    String color;
    int fuelLevel;

    //Behaviour
    public void accelerate(){
        if (fuelLevel < 1){
            System.out.println("No fuel");
            return;
        }
        fuelLevel--;
        System.out.println("Vroom");
    }

    public void getRefuelled(){
        fuelLevel = 100;
    }

    public Car(String brand, String color) {
        this.color = color;
        this.brand = brand;
    }

}

package academy.mindswap;

public class Car {
}
    /*

    //State
    private String brand;
    private String color;
    private int fuelLevel;
    private String licensePlate;
    private boolean isRunning;

    public Car(String brand, String color, String licensePlate){
        this.brand = brand;
        this.color = color;
        this.fuelLevel = 100;
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, String color){
        this.brand = brand;
        this.color = color;
        this.fuelLevel = 100;
    }

    //Behavior
    public void accelerate() {
        if(this.fuelLevel <= 0) {
            System.out.println("No fuel!");
            return;
        }
        this.fuelLevel--;
        System.out.println("Vroom");
    }

    public void getRefuelled(){
        if (amount <=0){
            System.out.println("Amount can't be less than 0");
            return;
        }
        this.fuelLevel = 100;
    }


    public String getBrand(){
        return this.brand;
    }

    public String getColor(){
       return color;
    }

    public getfuelLevel() {
        return getFuelLevel;
    }
}
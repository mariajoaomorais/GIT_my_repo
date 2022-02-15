package academy.mindswap;

public class Car {
    private static int numberOfCars = 0;
    private String brand;
    private String color;
    private Engine engine;
    private int count;
    private Radio radio;
    private Tyre tyre;

    public Car(String brand, String color, Engine engine){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.count++;
        Car.numberOfCars++;
    }

    public Car(String brand, Engine engine){
        this.brand = brand;
        this.engine = engine;
        Car.numberOfCars++;
    }

    public Car(String brand, String color, Engine engine, Radio radio, Tyre tyre) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.radio = radio;
        this.tyre = tyre;
    }

    public void accelerate(int fuel){
        int distance = engine.generateEnergy(fuel);

        if (tyre.getIntegrity() < tyre.getWearRate()*distance){
            this.radio.playVengaBoys();
            System.out.println("No vrum, vrum for you!");
            return;

        } else if(distance == 0){
            System.out.println("No vrum, vrum for you!");
            return;
        } else if (distance > 0 && tyre.getIntegrity()>0) {
            System.out.println("Vrum, vrum for " + distance + "km.");
            tyre.tyreExpectancy(distance);
            return;
        }
    }

    public void getRefuelled(){
        engine.setFuelLevel(100);
    }

    public String getBrand(String brand){
        return this.brand;
    }

    public String getColor(String color){
        return this.color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Radio getRadio() {
        return radio;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
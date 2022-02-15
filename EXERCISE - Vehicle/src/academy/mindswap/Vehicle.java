package academy.mindswap;

public class Vehicle {

    private double fuelLevel;
    private String brand;
    private String model;
    private double maxSpeed;
    private double fuelConsumption;
    private boolean isRented;
    private VehicleType type;

    public Vehicle(String brand, String model, double fuelConsumption, VehicleType type) {
        this.fuelLevel = 25;
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.isRented = false;
        this.type = type;
    }

    public void driving(int distance, int time){
    if(distance/time <= maxSpeed){
        if(fuelLevel >= distance/fuelConsumption){
            this.fuelLevel -= (distance/fuelConsumption);
            System.out.printf("Client drove for %d. FuelLevel: %f", distance, this.fuelLevel);
            return;
        }
        distance= (int) (this.fuelLevel*fuelConsumption);
        this.fuelLevel = 0;
        System.out.printf("Client drove for %d, because the tank got empty. FuelLevel: %f", distance, this.fuelLevel);
        return;

    }
        System.out.println("Velocity was exceeded!");
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void getRefuelled(){
        this.fuelLevel = 25;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public VehicleType getType() {
        return this.type;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}

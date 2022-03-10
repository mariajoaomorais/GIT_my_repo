package academy.mindswap;

public abstract class Car extends Vehicle {

    public Car(String brand, String model, double fuelConsumption, VehicleType type) {
        super(brand, model, fuelConsumption, type);
        super.setMaxSpeed(120);
    }
}

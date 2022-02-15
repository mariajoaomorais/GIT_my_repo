package academy.mindswap;

public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String model, double fuelConsumption) {
        super(brand, model, fuelConsumption, VehicleType.MOTORCYCLE);
        super.setMaxSpeed(100);
    }

    @Override
    public void driving(int distance, int time) {
        if(distance <= 80){
            super.driving(distance, time);
        } else {
            System.out.println("Motorcycles can't exceed 80Km/h");
        }
    }
}

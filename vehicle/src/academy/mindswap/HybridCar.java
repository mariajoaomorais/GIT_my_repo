package academy.mindswap;

public class HybridCar extends Car{

    private double batteryPower;
    private double batteryConsumption;

    public HybridCar(String brand, String model, double fuelConsumption, double batteryConsumption) {
        super(brand, model, fuelConsumption, VehicleType.HYBRID_CAR);
        this.batteryConsumption = batteryConsumption;
        this.batteryPower = 100;
    }

    @Override
    public void driving(int distance, int time) {
       double batterySpend = distance/batteryConsumption;

        if( distance/time <= 25 && batterySpend <= batteryPower){
           this.batteryPower-=batterySpend;
           System.out.printf("The vehicle drive silently for %d. Battery: %f", distance, batteryPower);
        } else {
            super.driving(distance, time);
        }
    }

    public void reCharge(){
        this.batteryPower = 100;
    }
}

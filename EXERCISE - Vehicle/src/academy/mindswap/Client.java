package academy.mindswap;

public class Client {

    private int clientId;
    private Vehicle[] vehicleRent;
    private int spotsCounter;


    public Client(int maxVehicles) {
        ++clientId;
        this.vehicleRent = new Vehicle[maxVehicles];
    }

    public void rentVehicle(Shop shop, VehicleType type) {
        for (int i = 0; i < vehicleRent.length; i++) {
            if (vehicleRent[i] == null) {
                vehicleRent[i] = shop.rent(type);
                return;
            }
        }
    }

    public void driving(int distance, int time, int vehicleNumber){
    this.vehicleRent[vehicleNumber].driving(distance, time);
    }

    public void reFuelled(int vehicleNumber){
        this.vehicleRent[vehicleNumber].getRefuelled();
    }

    public void reCharge(int vehicleNumber) {
        if (this.vehicleRent[vehicleNumber].getType().equals(VehicleType.HYBRID_CAR)) {
            ((HybridCar) this.vehicleRent[vehicleNumber]).reCharge();
        } else {
            System.out.println("This vehicle is not a hybrid car.");
        }
    }

    public void returnVehicle(int vehicleNumber, Shop shop){
        shop.returnVehicle(vehicleRent [vehicleNumber]);
    }
}

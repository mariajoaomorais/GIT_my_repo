package academy.mindswap;

public class Shop {

    private String shopName;
    private Vehicle[] vehicles;
    private int vehicleCounter;

    public Shop(String shopName, int maxVehicles) {
        this.shopName = shopName;
        this.vehicleCounter = 0;
        this.vehicles = new Vehicle[maxVehicles];
    }

    public void buyVehicle(VehicleType type, String brand, String model, double fuelConsumption) {

        if (vehicleCounter >= vehicles.length) {
            System.out.println("No room!");
            return;
        }

        switch (type) {
            case NORMAL_CAR -> {
                vehicles[vehicleCounter] = new NormalCar(brand, model, fuelConsumption);
                vehicleCounter++;
                break;
            }

            case MOTORCYCLE -> {
                vehicles[vehicleCounter] = new Motorcycle(brand, model, fuelConsumption);
                vehicleCounter++;
            }

        }
    }

    public void buyVehicle(String brand, String model, double fuelConsumption, double batteryConsumption){

        if (vehicleCounter >= vehicles.length) {
            System.out.println("No room!");
            return;
        }

        vehicles[vehicleCounter] = new HybridCar(brand, model, fuelConsumption, batteryConsumption);
        vehicleCounter++;
    }

    public void printListVehicles(){
        for(Vehicle vehicle: vehicles){
            if(vehicle != null){
                System.out.printf("Brand: %s  Model: %s %n", vehicle.getBrand(), vehicle.getModel());
            }
        }
    }

    public Vehicle rent(VehicleType type){

        if(vehicles != null){

            switch(type) {
                case HYBRID_CAR: {
                    Vehicle[] vehicles = getAllVehicleOfType(VehicleType.HYBRID_CAR);

                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] == null) {
                            continue;
                        }

                        if (!vehicles[i].isRented()) {
                            System.out.printf("You just rent a %s %s!%n", vehicles[i].getBrand(), vehicles[i].getModel());
                            vehicles[i].setRented(true);
                            return vehicles[i];
                        } else {
                            System.out.println("Cannot rent vehicle, because it's already rented!");
                        }

                    }
                }

                case NORMAL_CAR: {

                    Vehicle[] vehicles = getAllVehicleOfType(VehicleType.NORMAL_CAR);

                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] == null) {
                            continue;
                        }

                        if (!vehicles[i].isRented()) {
                            System.out.printf("You just rent a %s %s!%n", vehicles[i].getBrand(), vehicles[i].getModel());
                            vehicles[i].setRented(true);
                            return vehicles[i];
                        } else {
                            System.out.println("Cannot rent vehicle, because its already rented!");
                        }

                    }
                }

                case MOTORCYCLE: {
                    Vehicle[] vehicles = getAllVehicleOfType(VehicleType.MOTORCYCLE);

                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] == null) {
                            continue;
                        }

                        if (!vehicles[i].isRented()) {
                            System.out.printf("You just rent a %s %s!%n", vehicles[i].getBrand(), vehicles[i].getModel());
                            vehicles[i].setRented(true);
                            return vehicles[i];
                        } else {
                            System.out.println("Cannot rent vehicle, because its already rented!");
                        }

                    }
                }
            }

        }

        return null;
    }

    private Vehicle getVehicleByType(VehicleType type) {
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle == null) {
                continue;
            }

            if (vehicle.getType().equals(type)) {
                return vehicle;
            }
        }
        return null;
    }

    private Vehicle[] getAllVehicleOfType(VehicleType type){
        int counter = 0;
        Vehicle[] carsOfAType = new Vehicle [vehicleCounter];
        for (int i = 0; i <carsOfAType.length; i++) {
            Vehicle vehicle = vehicles[i];

            if (vehicle == null) {
                continue;
            }

            if (vehicle.getType().equals(type)) {
                carsOfAType[counter] = vehicle;
                counter++;

            }
        }
        System.out.println("We don't have this type of vehicle!");
        return carsOfAType;
    }

    public void returnVehicle(Vehicle vehicle){
        if(checkIfVehicleBelongsToShop(vehicle)){

            if(vehicle.getFuelLevel() < 20){
                double amountToPay = (20-vehicle.getFuelLevel())*1.50;
                System.out.printf("The fuellevel is under 20l. You to pay %d .", amountToPay);
            }

            System.out.println("Client return the vehicle.");
            vehicle.setRented(false);
            vehicle.getRefuelled();

        } else{
            System.out.println("This vehicle don't belong to this shop.");
        }

    }

    public boolean checkIfVehicleBelongsToShop(Vehicle vehicle){
        for (int i = 0; i < vehicles.length; i++) {
            if(vehicle ==vehicles[i]){
                return true;
            }
        }return false;

    }
}

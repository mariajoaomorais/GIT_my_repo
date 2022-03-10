package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shop standerSpeed = new Shop("Stander Speed", 5);

        Client jeremias = new Client(3);

        standerSpeed.buyVehicle(VehicleType.NORMAL_CAR, "Fiat", "Punto", 10);
        standerSpeed.buyVehicle(VehicleType.NORMAL_CAR, "Seat", "Ibiza", 10);
        standerSpeed.buyVehicle(VehicleType.MOTORCYCLE, "Vespa", "1.0", 10);
        standerSpeed.buyVehicle(VehicleType.HYBRID_CAR, "Vespa", "1.0", 10);
        //standerSpeed.printListVehicles();

        jeremias.rentVehicle(standerSpeed, VehicleType.HYBRID_CAR);
        jeremias.rentVehicle(standerSpeed, VehicleType.NORMAL_CAR);

    }
}

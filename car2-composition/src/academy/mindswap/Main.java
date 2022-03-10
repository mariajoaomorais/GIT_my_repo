package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	Engine engine = new Engine();
    Engine engine1 = new Engine();
    Car car = new Car("Tata", engine);
    car.accelerate(20);
    car.accelerate(80);
    car.accelerate(10);
    car.getRefuelled();
    }
}

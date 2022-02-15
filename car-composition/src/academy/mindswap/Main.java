package academy.mindswap;

public class Main {

    public static void main(String[] args) {

    /*    Engine engine = new Engine();
        Engine engine1 = new Engine();
        Radio radio = new Radio();
        Tyre tyre = new Tyre();


        Car car = new Car("Tata", "preto", new Engine(), new Radio(), new Tyre());

        car.accelerate(20);
        car.accelerate(80);
        car.accelerate(10);
        car.getRefuelled();
        car.accelerate(10);
*/

        Car doAço = new Car("Seat", "Preto Fosco", new Engine(), new Radio(), new Tyre());

        doAço.accelerate(20);
        System.out.println(doAço.getTyre().getIntegrity());
        doAço.accelerate(80);
        System.out.println(doAço.getTyre().getIntegrity());
        doAço.accelerate(900);
        System.out.println(doAço.getTyre().getIntegrity());
        doAço.accelerate(10);
        doAço.getRefuelled();
        doAço.accelerate(10);
        System.out.println("=======================================");
        doAço.getTyre().newTyres();
        doAço.accelerate(10);
    }

}

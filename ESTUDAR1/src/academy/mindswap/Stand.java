package academy.mindswap;

import java.sql.Array;
import java.util.ArrayList;

public class Stand {

    // Stand properties

    private String name;
    private ArrayList<String> cars;


    public Stand(String name, ArrayList<String> cars) {
        this.name = name;
        this.cars = cars;
    }

    public void printCarNames (){
        for (int i = 0; i < this.cars.size(); i++) {
            String car = this.cars.get(i);

            System.out.println(car);
        }
    }

    public void buy(String car){
        this.cars.add(car);
    }

    public void sell(String car){
        if(this.cars.contains(car)){
            this.cars.remove(car);
        } else {
            System.out.println("This car didn't exist!");
        }
    }

    public ArrayList getCars() {
        return cars;
    }
}

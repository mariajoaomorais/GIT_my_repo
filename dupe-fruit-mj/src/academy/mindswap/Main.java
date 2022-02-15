package academy.mindswap;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple (1);

        List<Fruit> fruits = Arrays.asList(
                apple,
                new Apple(0),
                apple,                 //DUPE
                new Orange(2),
                new Orange(2), // DUPE
                new Orange(3),
                new Apple (2),
                new Orange(3), // DUPE
                new Orange(3),  // DUPE
                new Orange(4),
                new Apple(5),
                new Apple(5)//DUPE
        );

        DupeFinder<Fruit> dupeFinder = new DupeFinder<>(fruits);
        System.out.println(dupeFinder.checkDupes());

        for (Fruit fruit : dupeFinder.getDupes()){
            System.out.println(fruit);
        }
        /**/

    }
}

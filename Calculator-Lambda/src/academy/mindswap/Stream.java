package academy.mindswap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream {

    static class Person {
        String name;
        int age;


        public Person(String name, int age) {
            this.name = name;
            this.age=age;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        //1. Create a stream of Person objects
        //2. Filter the Stream to only include people whose name is longer than 5 characters
        //3. Print the names of the people
        //4. Print the number of people in the stream

        List<Person> people = Arrays.asList(new Person("Johnny", 24), new Person ("Mary",16), new Person ("Mike",49), new Person ("Bob", 72));


        Consumer<Person> consumer = p -> System.out.println(p.name);
        //people.forEach(consumer);
        //people.forEach (System.out::println

       /*
        people.stream()
                .map(p -> person.getName().toLowerCase())
                .filter(name -> name.length() <4 || name.equals("bob"))
                .forEach(System.out::println);




        Integer sum = people.stream()
                .map(person -> person.age)
                .reduce(0, Integer::sum); //igual a: .reduce(0, (acc,actual->acc+actual);
        System.out.println(sum);
*/

    }


}

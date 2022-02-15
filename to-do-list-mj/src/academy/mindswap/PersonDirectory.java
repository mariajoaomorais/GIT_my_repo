package academy.mindswap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonDirectory {

    public static void main(String[] args) {

        Person p1 = new Person(23, "John");
        Person p2 = new Person(18, "Adam");
        Person p3 = new Person(23, "Peter");
        Person p4 = new Person(20, "Alicia");


        Queue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                //Vai comparar primeiro pelas idades e depois pelo nome
                int result = Integer.compare(o1.getAge(), o2.getAge());

                if(result ==0){
                    return o2.getName().compareTo(o1.getName());
                }
                return result;
            }
        });

        priorityQueue.add(p1);
        priorityQueue.add(p2);
        priorityQueue.add(p3);
        priorityQueue.add(p4);


        while(!priorityQueue.isEmpty()){
            Person person = priorityQueue.poll();
            //System.out.println(priorityQueue.

        }
    }
}

package academy.mindswap;

import javax.swing.*;
import java.util.*;

public class Sets {

    public static void main(String[] args) {

        /*
Object o = new Object();
        o.hashCode();
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set.add("c"));
        System.out.println(set.add("a"));

        for (String s : set){
            System.out.println(s);

        }

        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Set<Spring> setFromArray = new HashSet<>(list);
        System.out.println(setFromArray.size());
*/
        Set<Student> students = new HashSet<>();

    }

    private static class Student {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o){
            if(this ==o) return true;
            if(!(o instanceof Student)) return false;
            Student student = (Student) o;
            return age == student.age && name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age,name);
        }

    }


}

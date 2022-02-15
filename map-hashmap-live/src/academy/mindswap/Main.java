package academy.mindswap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer, String> studentsRepository = new HashMap<>();

        studentsRepository.put(1,"John");
        studentsRepository.put(2,"Mary");
        studentsRepository.put(5,"Peter");
        studentsRepository.put(10,"Antoine");
        studentsRepository.put(7,"Anna");
        studentsRepository.put(21,"Joseph");

        System.out.println(studentsRepository.get(21));
        System.out.println(studentsRepository);

        Map<String, Integer> studentsRepository2 = new HashMap<>();
        studentsRepository2.put("John", 1);
        studentsRepository2.put("Mary", 4);
        studentsRepository2.put("Peter", 10);

        System.out.println(studentsRepository2.get("John"));


    }
}

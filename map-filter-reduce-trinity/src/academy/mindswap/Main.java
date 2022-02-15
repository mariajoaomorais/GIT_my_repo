package academy.mindswap;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {


    private static String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
            "My friends all drive trash Porsches, I must make trash amends\n" +
            "Worked hard all my trash lifetime, no help from my trash friends\n" +
            "So Lord, won't you buy me a trash Mercedes Benz";


    public static void main(String[] args) {
	// write your code here

        //String[] wordsToFilter = prayer.toUpperCase().split(" ");

        System.out.println(Arrays.stream(prayer.toUpperCase().split(" "))
                .filter(w -> !w.equalsIgnoreCase("trash"))
                .collect(Collectors.joining(" ")));
    }

}

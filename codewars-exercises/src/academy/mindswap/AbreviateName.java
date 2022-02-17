package academy.mindswap;

import java.util.Locale;

public class AbreviateName {

    public static String abbrevName(String name) {

        String names[] = name.split(" ");
        String firstName = names[0];
        String secondName = names[1];
        name= firstName.toUpperCase().charAt(0) + "." + secondName.toUpperCase().charAt(0);
        return name;
    }


    public static void main(String[] args) {

        final String name = "john Smith";
        System.out.println(abbrevName(name));
    }

}
package academy.mindswap;

public class PasswordGenerator {

    public static void main(String[] args) {
	// write your code here
        generatePassword("Peter Gabriel"); // should print "G@br!el"
        generatePassword("Brian Adams"); // should print "@d@ms"
    }

    public static void generatePassword(String musicianName){
        // write your code here

        String[] splitedName = musicianName.split(" ");

        String lastName = splitedName[splitedName.length-1];

        String password = lastName
                .replaceAll("A|a", "@")
                .replaceAll("I|i", "!");

        System.out.println(password);

    }
}


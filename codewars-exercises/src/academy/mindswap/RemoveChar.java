package academy.mindswap;

public class RemoveChar {

    public static String remove(String str) {

        String finalWord = str.substring(1,str.length()-1);
        return finalWord;
    }

    public static void main(String[] args) {

        final String str = "Hello";

        System.out.println(remove(str));

    }


}

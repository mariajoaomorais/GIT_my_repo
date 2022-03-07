package academy.mindswap;

public class DoubleCharacter {
    public static String doubleChar(String s) {
        //enter your code here
        String finalWord="";
        for (int i = 0; i < s.length(); i++) {
            finalWord = finalWord + s.charAt(i)+s.charAt(i);
        }
        return finalWord;
    }


    public static void main(String[] args) {
        final String s = "Hello World";
        System.out.println(doubleChar(s));
    }
}

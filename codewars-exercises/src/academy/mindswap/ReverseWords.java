package academy.mindswap;

public class ReverseWords {

    public static void main(String[] args) {

        final String original = "   ";

        System.out.println(reverseWords(original));
    }

    public static String reverseWords(final String original) {

        String[] words = original.split(" ");
        String reversedString = "";

        if(original.trim().equalsIgnoreCase("")){
            return original;
        }

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString += reverseWord + " ";
            }
            return reversedString.trim();

    }

    //expected:<...j revo eht yzal .god[]>
    // was:    <...j revo eht yzal .god[ ]>


    /* resolução codewars
     public static String reverseWords(final String original)
  {
    String[] array = original.split(" ");

    if(array.length == 0)
        return original;


    int i = 0;
    for(String string : array){
        array[i] = new StringBuilder(string).reverse().toString();
        i++;
    }

    return String.join(" ",array);
  }
     */


}

package academy.mindswap;

import java.util.Arrays;

public class CountPositives {

    public static String countPositivesSumNegatives(int[] input) {
        int[] list = new int[2];
        int counterPositives=0;
        int sumNegatives=0;

        for (int i = 0; i < input.length; i++) {

            if(input[i]<0){
                sumNegatives = sumNegatives + input[i];
            }
            counterPositives++;

        }
        list= new int[]{counterPositives, sumNegatives};

        return Arrays.toString(list);
    }


    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

       // countPositivesSumNegatives(input);

        System.out.println(countPositivesSumNegatives(input));

    }
}
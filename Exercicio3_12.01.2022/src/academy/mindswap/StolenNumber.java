package academy.mindswap;

public class StolenNumber {

    public static void main(String[] args) {
        findStolenNumber(new int[]{1,2,3,5,6,7,8,9,10}); // should print 4
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,10}); // should print 9
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,9,10}); // should print "no number was stolen"
    }

    public static void findStolenNumber(int[] numbers){
        // write your code here

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // total sum of numbers (aritmetic progression)
        int expectedTotal = (10 * (10+1))/2;

        if (sum == expectedTotal) {
            System.out.println("No number was stolen!");
        } else {
            int stolenNumber = expectedTotal - sum;
            System.out.println("Stolen Number: " + stolenNumber);
        }
    }

}


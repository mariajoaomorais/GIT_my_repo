package academy.mindswap.Utils;

public class RandomGenerator {

    public static int generateRandom(){
        int max = 9999;
        int min = 1000;
        int a = (int) (Math.random() * (max - min + 1) + min);
        return a;
    }
}

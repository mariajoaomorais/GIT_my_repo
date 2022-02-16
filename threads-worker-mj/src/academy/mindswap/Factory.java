package academy.mindswap;

public class Factory {

    public static void main(String[] args) {

        Thread john = new Thread(new Worker("John", 20));
        Thread mary = new Thread(new Worker("Mary", 30));


    }
}

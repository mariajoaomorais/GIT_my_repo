package academy.mindswap;

public class Counter {
    int count = 0;

    public Counter ( ) {
        count = 0;
    }
    public synchronized void increment ( ) {
        count++;
    }
    public void reset ( ) {
        count = 0;
    }
    public int value ( ) {
        return count;
    }

    public int getCount() {
        return count;
    }
}


package academy.mindswap;

public class Synchronized {

    public void main(String[] args) {

       SynchronizedCounter counter = new SynchronizedCounter();
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   try{
                       Thread.sleep(100);
                   } catch (InterruptedException e){
                       e.printStackTrace();
                   }
               counter.increment();
               }
           }
       });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    counter.decrement();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

public class SynchronizedCounter{
        private volatile int c =0;
        private Object o = new Object();

        public synchronized void increment(){
            c++;
        }

        public synchronized void decrement(){
            c--;
        }

        public synchronized int value() {
            return c;
        }

        public void addValue(int value){
            synchronized (this){
                c += value;
            }
            synchronized (o){
                o.toString();
            }

        }
}




}


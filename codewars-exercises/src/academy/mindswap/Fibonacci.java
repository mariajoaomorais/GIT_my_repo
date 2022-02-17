package academy.mindswap;

public class Fibonacci {

    public int fibonacci (int n){

        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //fibonacci(n)-> n=0->fibbo=0; n=1->fibbo=1; n=2->fibbo=1; n=3->fibbo=2;
    // n=4 -> fibbo(n-1)+fibbo(n-2), então fibbo(3)+fibbo(2), vai ser igual a 2+1=3

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacci(10));

    }


}

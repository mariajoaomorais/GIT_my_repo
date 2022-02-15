package academy.mindswap;

public class Tyre {

    private double integrity = 100;
    double wearRate = 0.01;

    public Tyre() {
    }

    public void newTyres(){
        this.integrity = 100;
    }

    public void usedTyres(){
        this.integrity = 50;
    }

    public double getIntegrity() {
        if(this.integrity<0){
            this.integrity = 0;
        }
        return this.integrity;
    }

    public double tyreExpectancy(int distance){
        if(distance < 2 * this.integrity/wearRate)
        this.integrity -= wearRate*distance;
        return this.integrity;
    }

    public double getWearRate() {
        return wearRate;
    }
}

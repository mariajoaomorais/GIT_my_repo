package academy.mindswap;

public class Engine {

    private int range;
    private int fuelLevel;

    public Engine() {
        range = 10;
        fuelLevel = 1000;
    }

    public int generateEnergy(int fuel) {
        if (fuelLevel - fuel < 0) {
            return 0;
        }
        fuelLevel -= fuel;
        return fuel * range;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getRange() {
        return range;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}

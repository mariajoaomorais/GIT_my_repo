package academy.mindswap.Supernaturals;

import academy.mindswap.Strikeable.Witch;
import academy.mindswap.Supernaturals.Fairies.Fairy;
import academy.mindswap.Utils.RandomGenerator;

public class Supernatural {

    private int power;
    private int health;

    public Supernatural(int power) {
        this.power = power;
        this.health=100;
    }

    public int attack(){
        return power;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

package academy.mindswap.Strikeable;

import academy.mindswap.Supernaturals.Supernatural;
import academy.mindswap.Utils.Messages;

public class Witch extends Supernatural implements Strikeable {

    private boolean dead;

    public Witch() {
        super(30);
    }

    @Override
    public int attack() {
        System.out.print(Messages.WITCH_ATTACK);
        return super.attack();
    }


    public void suffer(int damage) {

        if (getHealth() - damage/2 < 0) {
            setHealth(0);
            dead = true;
            System.out.print("The Witch is dead.\n");
        }

        setHealth(getHealth()-damage/2);
        System.out.printf(Messages.WITCH_ATTACK, getPower(), getHealth());
    }
}
package academy.mindswap.Monsters;

import academy.mindswap.Utils.Messages;

public class Vampire extends Monster{

    private final double BITTING_PROBABILLITY = 0.02;
    private final int HEALING_RATE =10;

    public Vampire() {
        super(20, MonsterType.VAMPIRE);
    }

    @Override
    public int attack() {
        if(Math.random() < 0.2){
            bite();
        }
        return super.attack();
    }

    public void bite(){
        if(getHealth() + HEALING_RATE >=100){
            setHealth(100);
            System.out.printf(Messages.VAMPIRE_BITE_FULL_HEALTH);
            return;
        }

        setHealth(getHealth()+HEALING_RATE);
        System.out.printf(Messages.VAMPIRE_BITE, getHealth());
    }

}

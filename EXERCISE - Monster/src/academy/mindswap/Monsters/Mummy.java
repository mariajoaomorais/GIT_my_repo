package academy.mindswap.Monsters;

import academy.mindswap.Utils.Messages;

public class Mummy extends Monster {

    private final int MAX_CONSECUTIVE_ATTACKS = 2;
    private final int UNROLL_DAMAGE = 10;
    private int consecutiveAttacks;

    public Mummy() {
        super(10, MonsterType.MUMMY);
    }

    @Override
    public int attack() {
        consecutiveAttacks++;

        if(consecutiveAttacks==MAX_CONSECUTIVE_ATTACKS){
            consecutiveAttacks = 0;
            System.out.println(Messages.MUMMY_UNROLL_PREP);
            return unroll();
        }

        return super.attack();
    }

    public int unroll(){
        setHealth (getHealth()-UNROLL_DAMAGE);
        System.out.println(Messages.MUMMY_UNROLL);
        return 0;
    }

}

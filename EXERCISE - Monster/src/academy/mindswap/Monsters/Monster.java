package academy.mindswap.Monsters;

import academy.mindswap.Strikeable.Strikeable;
import academy.mindswap.Supernaturals.Supernatural;
import academy.mindswap.Utils.Messages;

public abstract class Monster extends Supernatural implements Strikeable {

    private int health;
    private boolean dead;
    private MonsterType type;


    public Monster(int power, MonsterType type) {
        super(power);
        this.type = type;
        dead = false;
    }

/*    public int attack(){
        System.out.printf(Messages.MONSTER_ATTACK, this);
        return power;
    }
*/
    public void suffer(int damage){
        if(health - damage <0){
            health = 0;
            dead=true;
            System.out.printf(Messages.DEAD_MONSTER, this);
        }

        health-=damage;
        System.out.printf(Messages.MONSTER_SUFFER, this, damage, health);

    }
    public boolean isDead() {
        return dead;
    }

    public int getHealth() {
    return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString(){
        return type.getDescription();
    }
}

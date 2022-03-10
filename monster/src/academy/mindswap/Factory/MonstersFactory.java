package academy.mindswap.Factory;

import academy.mindswap.Monsters.*;

public class MonstersFactory {

    private MonstersFactory(){
    }

    public static Monster create(MonsterType type){
        switch (type){
            case WEREWOLF:
                return new Werewolf();
            case MUMMY:
                return new Mummy();
            case VAMPIRE:
                return new Vampire();
            default:
                return new Werewolf();
        }
    }
}

package academy.mindswap;

import academy.mindswap.Factory.MonstersFactory;
import academy.mindswap.Monsters.Monster;
import academy.mindswap.Monsters.MonsterType;
import academy.mindswap.Utils.Messages;
import academy.mindswap.Utils.RandomGenerator;

public class Player {

    private final String name;
    private Monster[] monsters;
    private boolean lost;

    public Player(String name) {
        this.name = name;
    }

    public void pickMonsters(int numberOfMonsters){
        monsters = new Monster[numberOfMonsters];
        MonsterType[] monsterTypes = MonsterType.values(); //{werewolf, Mummy, vampire}
        MonsterType type;

        for (int i = 0; i < monsters.length; i++) {
            type= monsterTypes[RandomGenerator.generateRandom(0,monsterTypes.length - 1)];
            monsters[i] = MonstersFactory.create(type);
            System.out.printf(Messages.MONSTER_PICKED, name,monsters[i]);
        }
    }


    public int attack(){
        Monster monster = chooseMonster();
        System.out.printf(Messages.MONSTER_PICKED, name, monster);
        return monster.attack();
    }


    public void suffer(int damage){
        Monster monster = chooseMonster();
        System.out.printf(Messages.MONSTER_PICKED, name, monster);
        monster.suffer(damage);

        if(checkDeadMonsters()==monsters.length){
            lost=true;
        }
    }

    public Monster chooseMonster(){
        Monster monster = monsters[RandomGenerator.generateRandom(0,monsters.length-1)];
        if(monster.isDead()){
            monster = chooseMonster();
        }
    return monster;
    }

    public int checkDeadMonsters(){
        int deadMonsters = 0;
        for( Monster monster : monsters){
            deadMonsters = monster.isDead() ? deadMonsters + 1 : deadMonsters;
        }
        System.out.printf(Messages.DEAD_MONSTER_AMOUNT, name, deadMonsters);
        return deadMonsters;
    }

    public boolean hasLost(){
        return this.lost;
    }

    public String getName() {
        return name;
    }
}

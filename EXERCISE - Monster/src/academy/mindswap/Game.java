package academy.mindswap;

import academy.mindswap.Strikeable.Witch;
import academy.mindswap.Supernaturals.Fairies.Fairy;
import academy.mindswap.Supernaturals.Supernatural;
import academy.mindswap.Utils.Messages;
import academy.mindswap.Utils.RandomGenerator;

public class Game {

    private Player player1;
    private Player player2;
    private boolean finished;
    private Supernatural obstacle;
    Witch witch = new Witch();
    Fairy fairy = new Fairy();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    int setRandomToObstacle = RandomGenerator.generateRandom(1,2);

    /*
    public int obstacle(){

        if(RandomGenerator.generateRandom(1,6) <= 3){
            return new Witch(30).attack();
        }
        return new Fairy(10).attack();
    }

     */

    public int createObstacle(){

        int setRandomToObstacle = RandomGenerator.generateRandom(1,2);

        if(setRandomToObstacle == 1) {
            return witch.attack();
        }

        if(setRandomToObstacle == 2) {
            return fairy.attack();
        }
        return 0;
    }

    public void start(int monstersPerPlayer){

        finished = false;

        System.out.printf(Messages.PLAYER_PICKING, player1.getName());
        player1.pickMonsters(monstersPerPlayer);

        System.out.printf(Messages.PLAYER_PICKING, player2.getName());
        player2.pickMonsters(monstersPerPlayer);

        System.out.printf(Messages.START);

        Player attacker = player1;
        Player defender = player2;


        while(!finished){
            System.out.printf(Messages.HIT, attacker.getName());
            defender.suffer(attacker.attack());

            if(defender.hasLost()){
                System.out.printf(Messages.LOSE, defender.getName());
                finished=true;
                return;
            }

            System.out.printf(Messages.HIT, defender.getName());
            attacker.suffer(defender.attack());

            if(attacker.hasLost()){
                System.out.printf(Messages.LOSE, attacker.getName());
                finished= true;
                return;
            }

            System.out.printf(Messages.OBSTACLE_COMING);
            createObstacle();

            if(obstacle == fairy){
                defender.suffer(fairy.attack());
                attacker.suffer(fairy.attack());
                System.out.printf(Messages.OBSTACLE_ARRIVED, obstacle);
                System.out.printf(Messages.FAIRY_ATTACK, obstacle.getPower());
                finished=true;
                return;
            }

            if(obstacle == witch){
                defender.suffer(witch.attack());
                attacker.suffer(witch.attack());
                System.out.printf(Messages.WITCH_ATTACK);

                defender.attack(); //help??
                attacker.attack();//help??
                finished=true;
                return;
            }

            Player temp=attacker;
            attacker=defender;
            defender=temp;

            System.out.printf(Messages.NEXT_ROUND);
        }
    }

}

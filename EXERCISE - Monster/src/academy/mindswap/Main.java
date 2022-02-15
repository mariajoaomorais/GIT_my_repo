package academy.mindswap;

import academy.mindswap.Factory.MonstersFactory;
import academy.mindswap.Utils.RandomGenerator;

public class Main {

    public static void main(String[] args) {

       Game game = new Game(new Player("Dan"), new Player("Patrick"));

       game.start(3);//numero de cartas por jogador


    }





}

package academy.mindswap;

import java.util.ArrayList;

public class BlackJack {

    private static int drawNumber;
    private static int dealerPoints;
    private static int playerPoints;
    private static Player playerName = new Player("Player");
    private static int winnerCount;

    public static void drawNumber() {
        int cardValue = cardValue();
        int scorePlayer = scorePlayer(drawNumber);
        int scoreDealer = scoreDealer(drawNumber);
        BlackJack.drawNumber++;
        String name = name(drawNumber);
    }

    public static int cardValue () {
        int min = 1;
        int max = 13;
        int randomCard = (int) (Math.random() * (max - min + 1) + min);
        return randomCard;
    }

    public static String name (int drawNumber){
        if (drawNumber % 2 == 0) {
            return "Dealer";
        }
        return playerName.getPlayerName();
    }

    public static int scorePlayer (int cardValue){
        if (drawNumber % 2 != 0) {
          scorePlayer += cardValue;
        }
        return scorePlayer;
    }

    public static int scoreDealer (int cardValue){
        if (drawNumber % 2 == 0) {
            scoreDealer += cardValue;
        }
        return scoreDealer;
    }
    public static boolean isStillPlaying(int scorePlayer,int scoreDealer){
        if (scorePlayer >= 21 & winnerCount >0){
            return false;
        }
        if (scoreDealer >= 21 & winnerCount >0){
            return false;
        }
        return true;
    }
}




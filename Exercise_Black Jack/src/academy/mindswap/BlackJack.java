package academy.mindswap;

public class BlackJack {

    private static int scoreDealer;
    private static int scorePlayer;
    private static int drawNumber;
    private static int winnerCount;
    private static Player playerName = new Player("João");


    public static void setName(String name){
        playerName.setPlayerName(name);
    }

    public static void drawCard() {
        int cardValue = cardValue();
        BlackJack.drawNumber++;
        String name = name(drawNumber);
        int scoreDealer = scoreDealer(cardValue);
        int scorePlayer = scorePlayer(cardValue);

        if (isStillPlaying(scorePlayer,scoreDealer)){
            print(name, cardValue, scoreDealer, scorePlayer);
            winnerCheck(scorePlayer,scoreDealer);
        }

    }

    public static int cardValue(){
        int min = 1;
        int max = 13;
        int randomCardBetween1And13 = (int) (Math.random() * (max - min +1) +  min);
        return randomCardBetween1And13;
    }

    public static String name(int drawNumber) {
        if (drawNumber % 2 == 0){
            return "dealer";
        }
        return playerName.getPlayerName();

    }

    public static int scoreDealer(int cardValue){
        if (drawNumber % 2 == 0){
            scoreDealer += cardValue;
            return scoreDealer;
        }
        return scoreDealer;
    }

    public static int scorePlayer(int cardValue){
        if (drawNumber % 2 != 0){
            scorePlayer += cardValue;
            return scorePlayer;
        }
        return scorePlayer;
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


    public static void print(String player, int cardValue, int dealerScore, int playerScore){
        System.out.println("O " + player + " tirou um " + cardValue + ". Dealer:" + dealerScore + "  Player: " + playerScore);


    }

    public static void winnerCheck(int scorePlayer,int scoreDealer){


        if (scorePlayer == 21 || scoreDealer > 21)  {
            System.out.println(playerName.getPlayerName() + " Wins");
            winnerCount++;

        }
        if ( scoreDealer == 21 || scorePlayer > 21)  {
            System.out.println("Dealer Wins");
            winnerCount++;
        }

    }
}




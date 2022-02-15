package academy.mindswap;

import java.util.Arrays;

public class Game extends GameParent {

    private String player1;
    private String player2;
    private int maxRounds;

    private String[] choices = {"Rock", "Paper", "Scissors"};

    public Game(String player1, String player2, int maxRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.maxRounds = maxRounds;
    }

    
    public void startPlaying(){
        String choicePlayer1;
        String choicePlayer2;
        int totalNumberOfRounds = 0;
        String winnerOfTheRound = null;
        int player1Wins = 0;
        int player2Wins = 0;

        while(totalNumberOfRounds < maxRounds){
           totalNumberOfRounds++;
            System.out.println("Jogada n.º: " + totalNumberOfRounds);

            choicePlayer1 = choices[GenerateRandom.generateRandom(choices.length)];
            System.out.println("The choice of player1 is: " + choicePlayer1);

            choicePlayer2 = choices[GenerateRandom.generateRandom(choices.length)];
            System.out.println("The choice of player2 is: " + choicePlayer2);

            String[] resultsOfRound = new String[]{choicePlayer1, choicePlayer2};

            if(winnerOfTheRound.equals(player1)) {
                player1Wins++;
            } else {
                player2Wins++;
            }
            System.out.println("The " + winnerOfTheRound + "wins this round.");

        }

    }

    private String playerChoice(){
        return choices[GenerateRandom.generateRandom(choices.length)];
    }


    private String checkingWhoWins(String choicePlayer1, String choicePlayer2){
        String winner = player1;

        switch(choicePlayer1){
            case "Rock":
                if (choicePlayer2.equals("Paper")) {
                    winner = player2;
                }
                break;
            case "Paper":
                if (choicePlayer2.equals("Scissors")) {
                    winner = player2;
                }
                break;
            case "Scissors":
                if (choicePlayer2.equals("Rock")) {
                    winner = player2;
                }
                break;
        }

        return winner;

    }

    public void printResults(int player1Wins, int player2Wins) {

        if(player1Wins > player2Wins) {
            System.out.println(player1 + " Wins!");
        }
        if(player1Wins<player2Wins){
            System.out.println(player2 + " Wins!");
        } else{
            System.out.println("It's a tie");
        }
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getMaxRounds() {
        return maxRounds;
    }

    public String[] getChoices() {
        return choices;
    }
}


/*
   public GameChoicesEnum WinnerOfRound(GameChoicesEnum resultsOfRound){
        switch (resultsOfRound){
            case COMPUTER_WINS -> "Computer Wins!";
            case PLAYER1_WINS -> "Player1 Wins!";
            case NOBODY_WINS -> "Nobody Wins!";
        }
   }
}
*/
package academy.mindswap;

public class Game {
    private Player player1;
    private Player player2;
    private int minNumber;
    private int maxNumber;

    public Game(Player player1, Player player2, int minNumber, int maxNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public String play() {
        int secretNumber = RandomNumber.getRandomNumber(this.minNumber, this.maxNumber);
        int player1Number = RandomNumber.getRandomNumber(this.minNumber, this.maxNumber);
        int player2Number = RandomNumber.getRandomNumber(this.minNumber, this.maxNumber);

        String results = "Secret Number: " + secretNumber + "  " + player1.getPlayerName() + ": " + player1Number
                + "  " + player2.getPlayerName() + ": " + player2Number;

        if (player1Number == secretNumber && player2Number == secretNumber) {
            return "Both wins!" + results;
        }
        if (player1Number == secretNumber && player2Number != secretNumber) {
            return player1.getPlayerName() + " Wins!  " + results;
        }
        if (player2Number == secretNumber && player1Number != secretNumber) {
            return player2.getPlayerName() + " Wins!  " + results;
        }
        return "No one wins!  " + results;
    }
}


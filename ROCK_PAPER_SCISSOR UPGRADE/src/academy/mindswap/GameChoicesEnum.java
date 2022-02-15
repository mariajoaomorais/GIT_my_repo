package academy.mindswap;

public enum GameChoicesEnum {

    ROCK ("I'm a rock!"),
    PAPER("I'm paper!"),
    SCISSORS("I'm a scissor!");

    private String name;

    private GameChoicesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*

    COMPUTER_WINS("Paper","Rock"),
    COMPUTER_WINS("Rock","Scissors"),
    COMPUTER_WINS("Scissors","Paper"),
    PLAYER1_WINS("Paper","Rock"),
    PLAYER1_WINS("Paper","Rock"),
    PLAYER1_WINS("Paper","Rock"),
    NOBODY_WINS("Paper","Paper"),
    NOBODY_WINS("Scissors","Scissors"),
    NOBODY_WINS("Rock","Rock");

    private String choicePlayer1;
    private String choicePlayer2;

    private GameChoicesEnum(String choicePlayer1, String choicePlayer2){
        this.choiceComputer;
        this.choicePlayer1;
    }

    */
}

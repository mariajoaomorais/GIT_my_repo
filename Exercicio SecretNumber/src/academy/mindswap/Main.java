package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("John");
        Player player2 = new Player ("Peter");

        Game game = new Game (player1, player2, 1, 10);

        String result = game.play();
        System.out.println(result);
    }
}

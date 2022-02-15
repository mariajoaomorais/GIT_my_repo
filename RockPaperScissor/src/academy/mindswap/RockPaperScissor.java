package academy.mindswap;

public class RockPaperScissor {

    private static String[] wordsArray = {"Rock","Paper","Scissor"};

    public static void play(String playerMove){

        int computerIndexMove = pcIndexSelection();
        int playerIndexMove = playerIndexMove(playerMove);
        if (playerIndexMove<0){
            System.out.println("Jogada não válida.");
            return;
        }

        System.out.println("Player: " + wordsArray[playerIndexMove]);
        System.out.println("Computer: " + wordsArray[computerIndexMove]);
        defineWinner(playerIndexMove,computerIndexMove);

    }

    public static int pcIndexSelection () {
        int min = 0;
        int max = 2;
        int randomCardBetween0And2 = (int) (Math.random() * (max - min + 1) + min);

        return randomCardBetween0And2;
    }

    public static int playerIndexMove(String playerMove){

        for (int i = 0; i < wordsArray.length; i++) {
            if (playerMove.equalsIgnoreCase(wordsArray[i])){
                return i;
            }
        }
        return -1;

    }

    public static void defineWinner(int playerIndexMove, int computerIndexMove){

        if(playerIndexMove == 0 && computerIndexMove == 1 || playerIndexMove == 1 && computerIndexMove == 0) {
            System.out.println("Paper Wins");
            return;
        }

        if (playerIndexMove == 1 && computerIndexMove == 2 || playerIndexMove == 2 && computerIndexMove == 1) {
            System.out.println("Scissor Wins");
            return;
        }

        if (playerIndexMove == 0 && computerIndexMove == 2 || playerIndexMove == 2 && computerIndexMove == 0) {
            System.out.println("Rock Wins");
            return;
        }else{
            System.out.println("It's a tie.");
        }
    }
}

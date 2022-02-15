package academy.mindswap;

public class kata {

    String p1;
    String p2;

    public void rps (String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;

        if(p1 == "paper" && p2 =="rock") {
            System.out.println(p1 + " Wins");
        }

        if(p1 == "scissors" && p2 =="paper") {
            System.out.println("Player 1 won!");
        }

        if(p1 == "rock" && p2 =="scissors") {
            System.out.println("Player 1 won!");
        }
        if(p2 == "paper" && p1 =="rock") {
            System.out.println("Player 2 won!");
        }

        if(p2 == "scissors" && p1 =="paper") {
            System.out.println("Player 2 won!");
        }

        if(p2 == "rock" && p1 =="scissors") {
            System.out.println("Player 2 won!");
        } else {
            System.out.println("Draw!");
        }

    }

}


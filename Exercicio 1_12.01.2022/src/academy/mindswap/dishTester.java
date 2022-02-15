package academy.mindswap;

public class dishTester {

    public static void main(String[] args) {
        testDish("Bob Dylan", "beef wellington"); //should print true
        testDish("Mick Jagger", "mushroom soup"); //should print false
    }

    public static void testDish(String musicianName, String dish) {
        //Write your code here
        char musicianFirstLetter = musicianName.toLowerCase().charAt(0);
        char musicianLastLetter = musicianName.toLowerCase().charAt(musicianName.length() - 1);
        char dishFirstLetter = dish.toLowerCase().charAt(0);
        char dishLastLetter = dish.toLowerCase().charAt(dish.length() - 1);

        boolean firstLetter = musicianFirstLetter == dishFirstLetter && musicianLastLetter == dishLastLetter;
        boolean lastLetter = musicianLastLetter == dishLastLetter;

        System.out.println(firstLetter && lastLetter);

        //Outra solução:
        //if (musicianFirstLetter == dishFirstLetter && musicianLastLetter == dishLastLetter) {
          //  System.out.println(true);
        //} else {
          //  System.out.println(false);
        }
    }



/*
    String[] dishArray = dish.split("");

        if (musicianName.toLowerCase().startsWith(dishArray[0]) && dish.toLowerCase().endsWith(dishArray[dishArray.length-1])) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
     */



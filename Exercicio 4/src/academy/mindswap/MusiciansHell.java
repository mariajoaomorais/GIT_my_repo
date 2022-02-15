package academy.mindswap;

public class MusiciansHell {

    public static void main(String[] args) {
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};

        String musician = pickMusician(musicians); // should return the musician's name, or "No one will stay to help."
        System.out.println(musician);
    }

    public static String pickMusician(String[] musicians) {
        // write your code here

        for (int i = 0; i < musicians.length; i++) {
            if (musicians[i].length() > generateRandomInt(10, 15)) {
                return musicians[i];
            }
        }
        return "No one will stay here to help!";
    }

    public static int generateRandomInt (int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
        }

    }



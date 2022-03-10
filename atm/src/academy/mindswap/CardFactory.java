package academy.mindswap;

public class CardFactory {

    private CardFactory(){

    }

    public static Card createNewCard(int amount){

        if(amount > 10000000){
            System.out.println("There is not enough money in the world!");
            return null;
        }
        return new Card(amount);

    }
}

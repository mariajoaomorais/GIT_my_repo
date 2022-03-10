package academy.mindswap;

public class CardFactory {

    private CardFactory() {
    }

    private static int numberOfCards = 0;

    public static Card generateCard(){
        numberOfCards++;
        String cardNumber = "CARD-XX000"+ numberOfCards;
        Card card = new Card(cardNumber, numberOfCards+1000);
        return card;
    }
}

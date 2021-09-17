package carddeck;

public class Card {

    private Suit suit;
    private FaceValue value;


    public Card(){

    }

    public Card(Suit suit, FaceValue value){
        this.suit = suit;
        this.value = value;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public FaceValue getValue() {
        return value;
    }


}

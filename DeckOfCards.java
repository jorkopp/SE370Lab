import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(ArrayList<Card> deck) {                   //1 arg constructor to pass a collection of Card objects
        this.deck = deck;
    }

    public DeckOfCards(){
        List<String> suits = Card.getValidSuits();               //a static method
        List<String> faceTitles = Card.getValidFaceTitle();

        deck = new ArrayList<>();
                                                                //loop to create card objects
        for (String suit:suits)
        {
            for (String faceTitle:faceTitles)
                deck.add(new Card(faceTitle,suit));
        }


    }


}
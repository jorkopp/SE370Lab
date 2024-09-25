import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceTitle, suit;
    //private Image cardImage;

    public Card(String faceTitle, String suit) {
        setFaceTitle(faceTitle);
        setSuit(suit);
    }

    public String getFaceTitle() {
        return faceTitle;
    }

                                                                                 //method returning face titles that are for valid card objects
    public static List<String> getValidFaceTitle() {
        return Arrays.asList("ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king");
    }

                                                                                //method will validate argument and set instance variables
    public void setFaceTitle(String faceTitle) {
        List<String> validFaceTitle = getValidFaceTitle();
        faceTitle = faceTitle.toLowerCase();

        if (validFaceTitle.contains(faceTitle))
            this.faceTitle = faceTitle;
        else
            throw new IllegalArgumentException("Valid face names are:  "+ validFaceTitle);

    }

    public String getSuit() {
        return suit;
    }

    public static List<String> getValidSuits()
    {
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();                                   //returns list of valid suits
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;                                                        //refer to class level variables
        else
            throw new IllegalArgumentException("valid suits are: " + validSuits);     //returns useful message if valid suit
    }

    public String toString() {
        return String.format("%s of %s", faceTitle, suit);
    }

}








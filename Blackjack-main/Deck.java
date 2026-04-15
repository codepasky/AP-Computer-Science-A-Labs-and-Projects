import java.util.*;

public class Deck {

    public static final int NUMFACES = 13;

    public static final int NUMSUITS = 4;

    public static final int NUMCARDS = 52;

    public static final String SUITS[] = { "CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck(){
        stackOfCards = new ArrayList<Card>();

        for (int i = 0; i < NUMSUITS; i++) {
            for (int j = 0; j < NUMFACES; j++) {
                stackOfCards.add(new Card(j, SUITS[i]));
            }
        }
    }

    public int size(){
        return stackOfCards.size();
    }

    public int numCardsLeft(){
      return stackOfCards.size() - topCardIndex - 1; 

   }

    public void shuffle(){
        Collections.shuffle(stackOfCards);
    }

    public Card nextCard(){
        return stackOfCards.get(topCardIndex--);  

    }  

    public String toString(){
        return stackOfCards + "   topCardIndex = " + topCardIndex;

   }

}
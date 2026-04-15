public class DeckRunner {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println(deck);
        deck.shuffle();

        System.out.println("\n\n");

        System.out.println(deck);

        System.out.println(deck.nextCard());
        System.out.println(deck.numCardsLeft());
        
    }

}
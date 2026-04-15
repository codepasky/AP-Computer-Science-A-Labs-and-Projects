public class DealerRunner {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();

        dealer.shuffle();
        System.out.println(dealer.deal());
        System.out.println(dealer.numCardsLeftInDeck());
        System.out.println(dealer.hit());

    }
}

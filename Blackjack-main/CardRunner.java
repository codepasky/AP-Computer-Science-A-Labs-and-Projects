public class CardRunner {
    public static void main(String[] args) {

        Card card = new Card(12, "diamonds");
        System.out.println(card);

        Card card1 = new Card(12, "spades");
        System.out.println(card1.getFace());

        Card card3 = new Card(1, "diamonds");
        System.out.println(card3);

        Card card4 = new Card(4, "clubs");
        System.out.println(card4);

        Card card5 = new Card(11, "SPADES");
        System.out.println(card5);

        Card card6 = new Card(11, "spades");

        System.out.println(card.isEqual(card1));
        System.out.println(card5.isEqual(card6));

    }
}

public class PlayerRunner{

    public static void main (String[] args){
        
        Player player = new Player(10);

        player.addCardToHand(new Card(4, "hearts"));
        player.addCardToHand(new Card(5, "spades"));
        player.addCardToHand(new Card(2, "spades"));
        player.addCardToHand(new Card(10, "hearts"));

        System.out.println(player);
        System.out.println(player.hit());

    }

}
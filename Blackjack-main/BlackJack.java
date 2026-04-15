import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
   private ArrayList<Player> players;

   public BlackJack()
   {
      Scanner keyboard = new Scanner(System.in);
      players = new ArrayList<Player>();
      players.add(new Dealer());  // dealer is at index 0

      System.out.print("How many players? :: ");
      int numPlayers = keyboard.nextInt();
      for (int i = 0; i < numPlayers; i++)
      {
         players.add(new Player());
      }
   }

   public void playGame()
   {
      Scanner keyboard = new Scanner(System.in);
      Dealer dealer = (Dealer) players.get(0);
      String playAgain = "y";

      do
      {
         // 1st - shuffle the deck
         dealer.shuffle();

         // Reset all hands
         for (Player p : players)
         {
            p.resetHand();
         }

         // 2nd - deal each player two cards, dealer last
         for (int c = 0; c < 2; c++)
         {
            for (int i = 1; i < players.size(); i++)
            {
               players.get(i).addCardToHand(dealer.deal());
            }
            dealer.addCardToHand(dealer.deal());
         }

         // 3rd - loop through players (not dealer) for hitting
         for (int i = 1; i < players.size(); i++)
         {
            Player p = players.get(i);
            System.out.println("\nPlayer " + i);
            System.out.println("Current hand " + p);
            String answer = "";
            while (p.getHandValue() < 21)
            {
               System.out.print("Do you want to hit? [Y/N] ");
               answer = keyboard.nextLine().trim();
               if (answer.equalsIgnoreCase("N"))
                  break;
               p.addCardToHand(dealer.deal());
               System.out.println("Current hand " + p);
            }
         }

         // Dealer hits
         while (dealer.hit())
         {
            dealer.addCardToHand(dealer.deal());
         }

         // 4th - print all hands
         for (int i = 1; i < players.size(); i++)
         {
            Player p = players.get(i);
            System.out.println("\nPLAYER " + i);
            System.out.println("Hand Value :: " + p.getHandValue());
            System.out.println("Hand Size :: " + p.getHandSize());
            System.out.println("Cards in Hand :: " + p);
         }

         System.out.println("\nDEALER");
         System.out.println("Hand Value :: " + dealer.getHandValue());
         System.out.println("Hand Size :: " + dealer.getHandSize());
         System.out.println("Cards in Hand :: " + dealer);

         // 5th & 6th - determine winners and update win counts
         for (int i = 1; i < players.size(); i++)
         {
            Player p = players.get(i);
            if (p.getHandValue() > 21)
            {
               System.out.println("\nPlayer " + i + " busted!");
               if (dealer.getHandValue() <= 21)
               {
                  dealer.setWinCount(dealer.getWinCount() + 1);
               }
            }
            else if (dealer.getHandValue() > 21)
            {
               System.out.println("\nPlayer " + i + " wins - Dealer busted!");
               p.setWinCount(p.getWinCount() + 1);
            }
            else if (p.getHandValue() > dealer.getHandValue())
            {
               System.out.println("\nPlayer " + i + " has bigger hand value!");
               p.setWinCount(p.getWinCount() + 1);
            }
            else if (dealer.getHandValue() > p.getHandValue())
            {
               System.out.println("\nDealer has bigger hand value than Player " + i + "!");
               dealer.setWinCount(dealer.getWinCount() + 1);
            }
            else
            {
               System.out.println("\nPlayer " + i + " and Dealer tied!");
            }
         }

         // Print win totals
         System.out.println("\nDealer has won " + dealer.getWinCount() + " times.");
         for (int i = 1; i < players.size(); i++)
         {
            System.out.println("Player " + i + " has won " + players.get(i).getWinCount() + " times.");
         }

         System.out.print("\nDo you want to play again? [Y,y,N,n] :: ");
         playAgain = keyboard.nextLine().trim();

      } while (playAgain.equalsIgnoreCase("Y"));
   }

   public static void main(String args[])
   {
      BlackJack game = new BlackJack();
      game.playGame();
   }
}

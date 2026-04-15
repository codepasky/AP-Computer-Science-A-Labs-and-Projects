public class BlackJackCard extends Card
{
   public BlackJackCard()
   {
      super();
   }

   public BlackJackCard(int f, String s)
   {
      super(f, s);
   }

   public int getValue()
   {
      if (super.getValue() >= 11 && super.getValue() <= 13)
         return 10;
      if (super.getValue() == 1)
         return 11;
      return super.getValue();
   }
}
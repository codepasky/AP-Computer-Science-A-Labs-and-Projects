import java.util.*;

public class Player {

    private ArrayList<Card> hand;
    private int winCount;

    public Player(){
        hand = new ArrayList<Card>();
        winCount = 0;
    }

    public Player(int score){
        hand = new ArrayList<Card>();
        winCount = score;
    }

    public void addCardToHand(Card temp){
        hand.add(temp);
    }

    public void resetHand(){
        hand.clear();
    }

    public void setWinCount(int numwins){
        winCount = numwins;
    }

    public int getWinCount(){ 
        return winCount; 
    }

    public int getHandSize(){ 
        return hand.size(); 
    }

    public int getHandValue(){
        int total = 0;
        for(int i = 0; i < hand.size(); i++){
            total += hand.get(i).getValue();
        }
        return total;
    }

    public boolean hit(){
        if(getHandValue() > 21){
            return false;
        }
        if(getHandValue() <= 21){
            return true;
        }
        return false;
    }

    public String toString(){
      return "Hand = " + hand + " | Win Count = " + winCount + " | Hand Value = " + this.getHandValue();

    }
}
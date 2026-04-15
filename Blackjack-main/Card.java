public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			               "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	String suit;
	int face;

	public Card() {
		face = 0;
		suit = "NONE";
	}

	public Card(int f, String s) {
		face = f;
		suit = s.toUpperCase();
	}

	public void setSuit(String s) {
		suit = s.toUpperCase();
	}

	public void setFace(int f) {
		face = f;
	}

	public String getSuit() {
		return suit;
	}

	public String getFace() {
		return FACES[face];
	}

	public int getValue(){
		return face;
	}

	public boolean isEqual(Card other){
		return this.face == other.face && this.suit.equals(other.suit);
	}

	public String toString() {
		return getFace() + " of " + getSuit() + " | value = " + getValue();
	}
}
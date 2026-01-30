//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 29/01/2026

//add imports as needed
import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> rayList = new ArrayList<>();
		rayList.add(2);
		rayList.add(7);
		rayList.add(11);
		rayList.add(21);
		rayList.add(5);
		rayList.add(7);
		System.out.println(ListOddToEven.go(rayList));
	}
}
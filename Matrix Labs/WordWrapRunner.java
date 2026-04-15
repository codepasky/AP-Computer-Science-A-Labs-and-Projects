//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class WordWrapRunner
{
	public static void main( String args[] )
	{
		//add test cases
		WordWrap.print(WordWrap.build("dogfood", 3));		
		WordWrap.print(WordWrap.build("dogfood", 2));
		WordWrap.print(WordWrap.build("apluscompsci.com", 5));
		WordWrap.print(WordWrap.build("A", 1));
		WordWrap.print(WordWrap.build("ABCDEFG" , 4));
	}
}
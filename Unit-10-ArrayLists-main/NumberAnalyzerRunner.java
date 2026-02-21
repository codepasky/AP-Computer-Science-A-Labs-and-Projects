//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class NumberAnalyzerRunner
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test + "\n");
		out.println("odd count = "+test.countOdds() + "\n");
		out.println("even count = "+test.countEvens() + "\n");
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");

		//add more test cases
		int[] r1 = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11};
		NumberAnalyzer test1 = new NumberAnalyzer( r1 );
		out.println(test1 + "\n");
		out.println("odd count = "+test1.countOdds() + "\n");
		out.println("even count = "+test1.countEvens() + "\n");
		out.println("perfect count = "+test1.countPerfects()+"\n\n\n");
		
		int[] r2 = {1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 151, 16, 17, 18, 19, 20};
		NumberAnalyzer test2 = new NumberAnalyzer( r2 );
		out.println(test2 + "\n");
		out.println("odd count = "+test2.countOdds() + "\n");
		out.println("even count = "+test2.countEvens() + "\n");
		out.println("perfect count = "+test2.countPerfects()+"\n\n\n");
	}
}
// (c) A+ Computer Science
// www.apluscompsci.com
// Name - paschal

import static java.lang.System.*;

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7,28,496,1111,199,201,17,-212,-211};
		for( int num : nums )
		{
			Number one = new Number( num );

			if ( one.isOdd() )
				System.out.print( one + " is odd.\n" );
			else 
				System.out.print( one + " is not odd.\n" );
			
			if ( one.isPerfect() )
				System.out.print( one + " is perfect.\n" );
			else 
				System.out.print( one + " is not perfect.\n" );
		}
	}
}
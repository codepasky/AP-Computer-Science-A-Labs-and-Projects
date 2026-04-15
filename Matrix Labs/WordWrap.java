//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class WordWrap
{
	//makes a matrix sz X sz
	//wraps s around into the matrix
	
	//call    build( "dogfood", 3 ) would return   {{d,o,g},{o,o,f},{d,?,?}}
	//call    build( "dogfood", 2 ) would return   {{d,o},{f,g}}
	//fill matrix with ? for all empty spots
	//use all letters from s that will fit
	
	public static char[][] build( String s, int sz )
	{
		char[][] m = new char[sz][sz];
		int index = 0;
		for (int i = 0; i < sz; i++)
		{
			for (int j = 0; j < sz; j++)
			{
				if (index < s.length())
				{
					m[i][j] = s.charAt(index);
					index++;
				}
				else
				{
					m[i][j] = '?';
				}
			}
		}
		return m;
	}
	
	public static void print( char[][] b )
	{
		for(int i = 0; i < b.length; i++)
			{
				for(int j = 0; j < b[i].length; j++)
					{
						System.out.print(b[i][j] + " ");
					}
				System.out.println();
			}
			System.out.println();
	}
}
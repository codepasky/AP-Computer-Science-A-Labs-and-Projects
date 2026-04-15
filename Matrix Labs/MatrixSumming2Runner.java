//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		
		int rows = file.nextInt();
		int cols = file.nextInt();
		int[][] m = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				m[i][j] = file.nextInt();
			}
		}
		System.out.println(m);
		// reference slideshow 13 for help on file input

	}
}




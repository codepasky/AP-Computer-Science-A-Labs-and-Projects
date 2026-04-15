//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class TotalRowRunner
{
	public static void main( String args[] )
	{
		int[][] m = {{1,2,3},{5,5,5,5}};
		System.out.println(TotalRow.getRowTotals(m));
		//add code here
		int[][] m2 = {{1,2,3},{5},{1},{2,2}};
		System.out.println(TotalRow.getRowTotals(m2));
	}
}




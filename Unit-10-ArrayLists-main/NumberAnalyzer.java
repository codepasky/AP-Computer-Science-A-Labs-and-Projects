// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	//uncomment once you have a working Number class
	private ArrayList<Number> list;

	public NumberAnalyzer(int[] ray)
	{
		//make a new ArrayList
		list = new ArrayList<Number>();
		//loop through ray
		for(int i = 0; i < ray.length; i++){
			//make a new Number with each value from ray
			Number num = new Number(ray[i]);
			//add the new Number to list	
			list.add(num);
		}
	}

	public int countOdds()
	{
	  int count = 0;
      for (Number num : list){
        if (num.isOdd()){
            count++;
        }
      }
	  return count;
	}

	public int countEvens()
	{
      int count = 0;
      for (Number num : list){
        if (!(num.isOdd())){
            count++;
        }
      }
	  return count;
	}

	public int countPerfects()
	{
	  int count = 0;
      for (Number num : list){
        if (num.isPerfect()){
            count++;
        }
      }
	  return count;
	}
	
	public String toString( )
	{
		return "" + list;
	}
}
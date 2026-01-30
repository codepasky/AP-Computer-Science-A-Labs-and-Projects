//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
//Date - 29/01/2026

import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( ArrayList<Integer> ray )
	{
		for(int i = 0; i < ray.size(); i++) { // first odd found
			if(ray.get(i) % 2 != 0) {
				for(int j = ray.size()-1; j >= i; j--){ // last even found
					if(ray.get(j) % 2 == 0)
						return j;
				}
			}
		}
		return -1; // if no odd numbers are found or no even ones following an odd
	}
}
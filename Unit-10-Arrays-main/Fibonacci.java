//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal
import java.util.*;

public class Fibonacci
{
	//instance variable
	private int[] fib;

	//constructors
	public Fibonacci() {
		fib = new int[10];
	}
	public Fibonacci(int size) {
		fib = new int[size];
	}

	//set method
	public void sequence() {
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
	}

	//get method
	public int[] getFib() {
		return fib;
	}

	//toString
	public String toString() {
		return Arrays.toString(fib);
	}

}

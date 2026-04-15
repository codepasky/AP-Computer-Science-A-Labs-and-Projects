//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner {
	public static void main(String args[]) throws IOException {
		Grid g = new Grid(3, 3, new String[] { "1", "b", "c" });
		System.out.println(g);

		System.out.println(g.findMax(new String[]{"1","b","c"}));
	
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import java.util.Arrays;
import java.util.Scanner;

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values

			//ask for ht
			System.out.print("Enter the height of monster " + (i+1) + " :: ");
			int height = keyboard.nextInt();
			//ask for wt
			System.out.print("Enter the weight of monster " + (i+1) + " :: ");
			int weight = keyboard.nextInt();
			//ask for age
			System.out.print("Enter the age of monster " + (i+1) + " :: ");
			int age = keyboard.nextInt();
			System.out.println("\n");
	
			//instantiate a new Monster() and add it to the herd
			Monster m = new Monster(height, weight, age);
			herd.add(i, m);

						
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
		System.out.println("SMALLEST :: " + herd.getSmallest()+"\n");
		System.out.println("LARGEST :: " + herd.getLargest()+"\n");
			
	}		
}
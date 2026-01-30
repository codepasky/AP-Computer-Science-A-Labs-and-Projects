//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;

	}

	public Monster getLargest( )
	{
		Monster largest = myMonsters[0];
		for (int i = 1; i < myMonsters.length; i++) {
			if (myMonsters[i].isBigger(largest)) {
				largest = myMonsters[i];
			}
		}
		return largest;
	}

	public Monster getSmallest( )
	{
		Monster smallest = myMonsters[0];
		for (int i = 1; i < myMonsters.length; i++) {
			if (myMonsters[i].isSmaller(smallest)) {
				smallest = myMonsters[i];
			}
		}
		return smallest;
	}

	public String toString()
	{
		return "" + Arrays.toString(myMonsters);
	}
}
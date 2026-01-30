import java.util.ArrayList;

public class FlowerGarden {
	// create an arraylist instance variable
	private ArrayList<String> flowers = new ArrayList<>();

	// write a constructor
	public FlowerGarden() {
		flowers = new ArrayList<String>();
	}

	// write add flower
	public void addFlower(String num_Flower) {
		flowers.add(num_Flower);
	}

	// write get count
	public int getCount(String flower) {
		for (String s : flowers) {
			String name = s.substring(s.indexOf(" ") + 1);

			if (name.equalsIgnoreCase(flower)) {
				return Integer.parseInt(s.substring(0, s.indexOf(" ")));
			}
		}
		return 0;
	}

	// write get flower name
	public String getFlowerName(int spot) {
		return flowers.get(spot).substring(flowers.get(spot).indexOf(" ") + 1);
	}

	// write in range
	public int inRange(int min, int max) {
		int count = 0;

		for (String s : flowers) {
			int num = Integer.parseInt(s.substring(0, s.indexOf(" ")));

			if (num >= min && num <= max) {
				count++;
			}
		}
		return count;
	}

	// write find flower
	public int findFlower(String flower) {
		for (int i = 0; i < flowers.size(); i++) {
        
        	String name = flowers.get(i).substring(flowers.get(i).indexOf(" ") + 1);

			if (name.equalsIgnoreCase(flower)) {
				return i;
			}
    	}

    	return -1;
	}

	// write max flower
	public int maxFlower() {
		int max = 0;

		for (String s : flowers) {
			int num = Integer.parseInt(s.substring(0, s.indexOf(" ")));

			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	// write a toString
	public String toString() {
		return flowers.toString();
	}
}
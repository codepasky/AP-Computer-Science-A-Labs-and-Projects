//(c) A+ Computer Science
// www.apluscompsci.com

public class FlowerGardenRunner {
	public static void main(String args[]) {
		FlowerGarden fg = new FlowerGarden();

		fg.addFlower("14 daisy");
		fg.addFlower("01 rose");
		fg.addFlower("05 Tulip");
		fg.addFlower("18 hibiscus");

		System.out.println(fg.getCount("tulip"));
		System.out.println(fg.getFlowerName(0));
		System.out.println(fg.findFlower("Daisy"));
		System.out.println(fg.inRange(5, 15)); //returns how many flowers in specified range
		System.out.println(fg.maxFlower());
		System.out.println(fg.toString());
	}
}
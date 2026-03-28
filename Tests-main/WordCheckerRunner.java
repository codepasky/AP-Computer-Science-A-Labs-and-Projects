import java.util.*;

public class WordCheckerRunner {
    public static void main(String[] args) {

        WordChecker newList = new WordChecker();

        // test case 1 - returns true
        // newList.add("an");
        // newList.add("band");
        // newList.add("band");
        // newList.add("abandon");

        // test case 2 - returns false
        // newList.add("to");
        // newList.add("too");
        // newList.add("stool");
        // newList.add("tools");

        // test case 3 - for createList method
        newList.add("catch");
        newList.add("bobcat");
        newList.add("catchacat");
        newList.add("cat");
        newList.add("at");

        System.out.println(newList.isWordChain());
        System.out.println(newList.createList("catch"));
    }
}
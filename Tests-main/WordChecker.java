import java.util.*;

public class WordChecker {

    private ArrayList<String> wordList;

    public WordChecker() {
        wordList = new ArrayList<String>();
    }

    public void add(String word){
        wordList.add(word);
    }

    public boolean isWordChain(){
        for(int i = 1; i < wordList.size(); i++){
		    if(!wordList.get(i).contains(wordList.get(i-1))){
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target){
        ArrayList<String> newList = new ArrayList<String>();
        int targLen = target.length();

        for(int i = 0; i < wordList.size(); i++){
            String word = wordList.get(i);

            if(word.startsWith(target)){
                String remaining = word.substring(targLen);
                newList.add(remaining);
            }
        }
        return newList;
    }
}
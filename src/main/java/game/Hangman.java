package game;
import java.util.List;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hangman {
    private String mLetter;
    private String[] word = {"cat"};
    private String wordChoice = "cat";
    private int wordLocation;




    public String word_Generator() {
        Random myRandomGenerator = new Random();
        int randomIndex = myRandomGenerator.nextInt(word.length);
        wordChoice = word[randomIndex];
        return wordChoice;
    }

    public String displayUserString(){
        String blanks = "";
        int length = wordChoice.length();
        for (int i=0; i<length; i++){
            blanks += "_";
        }
        return blanks;
    }




    public ArrayList<Integer> findLetter(String userInput) {
        ArrayList<Integer> answerIndex = new ArrayList<>();
        Integer index = wordChoice.indexOf(userInput);
        while (index >= 0) {
            answerIndex.add(index);
            index = wordChoice.indexOf(userInput, index + 1);
            System.out.println(answerIndex);
        }
        return answerIndex;

    }




//    public String placeLetter(String userInput) {
//        for(int i = 0; i > wordChoice.length(); i++){
//            userString
//        }
//    }
//    public int breakWord (String wordChoice){
//        char [] wordArray = wordChoice.toCharArray();
//
//        for (char wordChoice : wordArray)
//
//        return something;
//    }
}
package game;
import java.util.List;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hangman {
    private String mLetter;
    private String [] word = {"cat"};
    private String wordChoice = "cat";
    private int wordLocation;
    public String word_Generator() {
        Random myRandomGenerator = new Random();
        int randomIndex = myRandomGenerator.nextInt(word.length);
        wordChoice = word[randomIndex];
        return wordChoice;
        }

       public int findLetter(String userInput){
        wordLocation = wordChoice.indexOf(userInput);
        return wordLocation;
    }
    public Hangman() {
           if (wordLocation >= 0){

           }
    }
    public Hangman(String letter){
        mLetter = letter;
    }
    public String getLetter(){
        return mLetter;
    }
}


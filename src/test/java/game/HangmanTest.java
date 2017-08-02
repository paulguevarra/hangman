package game;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Guest on 8/2/17.
 */
public class HangmanTest {
    @Test
    public void newLetter_instatiatesCorrectly(){
        Hangman testHangman = new Hangman("a");
        assertEquals(true, testHangman instanceof Hangman);
    }
    @Test
    public void newLetter_multipleLetters(){
        Hangman testHangman = new Hangman("ab");
        assertEquals("ab", testHangman.getLetter());
    }



}
package game;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Guest on 8/2/17.
 */
public class HangmanTest {
    @Test
    public void newLetter_instatiatesCorrectly(){
        Hangman testHangman = new Hangman();
        assertEquals(true, testHangman instanceof Hangman);
    }

    @Test
    public void newLetter_findSingleLetterLocation(){
        Hangman testHangman = new Hangman();
        assertEquals("cat", testHangman.word_Generator());
    }
    @Test
    public void newLetter_findLocation(){
        Hangman testHangman = new Hangman();
        assertArrayEquals(1>, testHangman.findLetter("a"));
    }

    @Test
    public void check_blanks() throws Exception {
        Hangman testHangman = new Hangman();
        assertEquals("___", testHangman.displayUserString());
    }
}
package com.musala.practice.com.musala.practice.hangman;

import com.musala.practice.hangman.ConsoleReader;
import com.musala.practice.hangman.HangMan;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for class {@link HangMan} to chech main logic,
 * and test for class {@link ConsoleReader} to check result received from the reader.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class HangManTest {

    @Test
    public void test_falseAnswer() {
        HangMan hangMan = new HangMan(new MockReader("sbkopje"), "skopje");
        hangMan.play();
        assertEquals(6, hangMan.getCorrect().size());
        assertEquals(1, hangMan.getIncorrect().size());
    }

    @Test
    public void test_trueAnswer() {
        HangMan hangMan = new HangMan(new MockReader("skzxcvbnmasdfghjkl"), "skopje");
        hangMan.play();
        assertEquals(6, hangMan.getIncorrect().size());
        assertEquals(2, hangMan.getCorrect().size());
    }

    @Test
    public void test_reader() {
        InputStream input = new ByteArrayInputStream("test".getBytes());
        System.setIn(input);
        ConsoleReader consoleReader = new ConsoleReader();
        String actual = consoleReader.read();
        assertEquals("t", actual);
    }
}

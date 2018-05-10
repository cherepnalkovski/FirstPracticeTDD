package com.musala.practice.com.musala.practice.hangman;

import com.musala.practice.hangman.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Mock class used to simulate user input from console line.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class MockReader implements Reader {

    private List letters;

    public MockReader(String word) {
        this.letters = new ArrayList(Arrays.asList(word.split("")));
    }

    @Override
    public String read() {
        String letter = letters.get(0).toString();
        letters.remove(0);
        return letter;
    }
}
package com.musala.practice.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class simulates Hangman game.
 * Player have to guss some word, typing one letter at a time.
 * When the player guess the word, or after 6 wrong guesses,
 * the game ends.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class HangMan {

    private Logger logger = Logger.getLogger("HangMan");

    private List phraseList;
    private List phraseListFiltered;
    private List hiddenPhrase;
    private List alphabet = new ArrayList(Arrays.asList("abcdefgijklmnopqrstuvwxyz".split("")));
    private List incorrect = new ArrayList();
    private List correct = new ArrayList();
    private Reader reader;


    public HangMan(Reader reader, String phrase) {
        this.reader = reader;
        this.phraseList = new ArrayList(Arrays.asList(phrase.toLowerCase().split("")));
        this.hiddenPhrase = new ArrayList(phraseList);
        this.phraseListFiltered = new ArrayList(phraseList);
    }

    /**
     * This is the main logic where we check if typed letter exist in th word or not.
     * If player type 6 wrong letters, the game ends.
     */
    public void play() {

        Collections.fill(hiddenPhrase, "-");
        logger.info("Game begins...");
        Printer.print(alphabet, correct, incorrect, hiddenPhrase);

        while (incorrect.size() < 6 && correct.size() != phraseList.size()) {
            String letter = reader.read();
            if (phraseListFiltered.contains(letter)) {
                while (phraseListFiltered.contains(letter)) {
                    logger.info("Correct!");
                    hiddenPhrase.set(phraseListFiltered.indexOf(letter), letter);
                    phraseListFiltered.set(phraseListFiltered.indexOf(letter), "*");
                    correct.add(letter);
                    alphabet.remove(letter);
                    Printer.print(alphabet, correct, incorrect, hiddenPhrase);
                }
            } else {
                logger.info("Incorect!");
                incorrect.add(letter);
                alphabet.remove(letter);
                Printer.print(alphabet, correct, incorrect, hiddenPhrase);
            }
        }
        if (correct.size() == phraseList.size()) {
            logger.info("Congratulations! You win!");
        } else {
            logger.info("You loose!!!");
            logger.info("Required phrase :" + phraseList);
        }

    }

    public List getIncorrect() {
        return incorrect;
    }

    public List getCorrect() {
        return correct;
    }
}

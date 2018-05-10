package com.musala.practice.hangman;

/**
 * Entry point for Hangman game.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class Application {

    public static void main(String[] args) {
        HangMan hangman = new HangMan(new ConsoleReader(), "Skopje");
        hangman.play();
    }
}

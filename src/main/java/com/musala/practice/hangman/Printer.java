package com.musala.practice.hangman;

import java.util.List;

/**
 * Class used only for printing instructions and results to the player.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
class Printer {

    private Printer() {
    }

    public static void print(List alphabet, List correct, List incorrect, List hiddenPhrase) {
        Printer.printMessages(alphabet, correct, incorrect, hiddenPhrase);
        Printer.printPicture(incorrect.size());
    }

    private static void printMessages(List alphabet, List correct, List incorrect, List hiddenPhrase) {
        System.out.println("Available letters :" + alphabet);
        System.out.println("Correct letters :" + correct);
        System.out.println("Incorect letters :" + incorrect);
        System.out.println("Word to guess " + hiddenPhrase);
    }

    private static void printPicture(int misses) {
        switch (misses) {
            case 0:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 1:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 2:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 3:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 4:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 5:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|       |");
                System.out.println("|      /");
                System.out.println("|");
                System.out.println("|__________");
                break;
            case 6:
                System.out.println("_________");
                System.out.println("|       |");
                System.out.println("|       O");
                System.out.println("|      /|\\");
                System.out.println("|       |");
                System.out.println("|      / \\");
                System.out.println("|");
                System.out.println("|__________");
                break;
            default:
                break;
        }
    }

}

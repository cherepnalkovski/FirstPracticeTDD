package com.musala.practice.hangman;

import java.util.Scanner;

/**
 * Class used to implement reading from console line.
 *
 * @author <a href="mailto:cherepnalkovski@hotmail.com> Vladimir Cherepnalkovski</a>
 */
public class ConsoleReader implements Reader {

    /**
     * Reading letters from console line
     *
     * @return letter
     */
    @Override
    public String read() {
        System.out.println("Type letter...");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().substring(0, 1).toLowerCase();
    }
}

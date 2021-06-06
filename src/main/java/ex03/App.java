/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex03;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String quote = myApp.getQuote();
        String who = myApp.whoSaid();
        String outputString = myApp.generateOutputString(quote, who);
        myApp.printOutput(outputString);
    }

    public String getQuote() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    public String whoSaid() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }

    public String generateOutputString(String quote, String who) {
        return who+" says, \""+quote+"\"";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}

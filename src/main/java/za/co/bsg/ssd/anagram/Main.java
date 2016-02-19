package za.co.bsg.ssd.anagram;

import za.co.bsg.ssd.anagram.counter.AnagramCounter;
import za.co.bsg.ssd.anagram.printer.AnagramPrinter;
import za.co.bsg.ssd.anagram.reader.WordList;

public class Main {

    public static void main(String[] args) {
        /**
         * Provide implementations for {@link WordList}, {@link AnagramCounter}, and {@link AnagramPrinter}.
         * Then replace the nulls in the instantiation below with your implementations.
         */
        WordList wordList = null;
        AnagramPrinter anagramPrinter = null;
        AnagramCounter anagramCounter = null;

        AnagramCalculator anagramCalculator = new AnagramCalculator(wordList, anagramCounter, anagramPrinter);

        try {
            anagramCalculator.run();
        } catch (NullPointerException e) {
            System.err.println("Did you forget to provide your implementations to the AnagramCalculator?");
            throw e;
        }
    }
}

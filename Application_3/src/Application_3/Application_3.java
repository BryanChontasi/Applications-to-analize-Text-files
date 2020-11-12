package Application_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/**
 *
 * @author Bryan Chontasi
 */
public class Application_3 {

    public static void main(String[] args) throws FileNotFoundException {
        //class called readDocumentRxt to read the document.
        readDocumentTxt a = new readDocumentTxt();

        String sonnet3 = a.readTxt("sonnet3.txt").toUpperCase();

        // To count the words in the text I used StringTokenizer class
        StringTokenizer words = new StringTokenizer(sonnet3);

        //Counts the number of letters:
        int numberOfLetters = 0; 

        // This for loop function counts how many letters are in the text.
        for (int x = 0; x < sonnet3.length(); x++) {
            if ((sonnet3.charAt(x) == 'A') || (sonnet3.charAt(x) == 'B')
                    || (sonnet3.charAt(x) == 'C')
                    || (sonnet3.charAt(x) == 'D') || (sonnet3.charAt(x) == 'E')
                    || (sonnet3.charAt(x) == 'F') || (sonnet3.charAt(x) == 'G')
                    || (sonnet3.charAt(x) == 'H') || (sonnet3.charAt(x) == 'I')
                    || (sonnet3.charAt(x) == 'J') || (sonnet3.charAt(x) == 'K')
                    || (sonnet3.charAt(x) == 'L') || (sonnet3.charAt(x) == 'M')
                    || (sonnet3.charAt(x) == 'N') || (sonnet3.charAt(x) == 'O')
                    || (sonnet3.charAt(x) == 'P') || (sonnet3.charAt(x) == 'Q')
                    || (sonnet3.charAt(x) == 'R') || (sonnet3.charAt(x) == 'S')
                    || (sonnet3.charAt(x) == 'T') || (sonnet3.charAt(x) == 'U')
                    || (sonnet3.charAt(x) == 'V') || (sonnet3.charAt(x) == 'W')
                    || (sonnet3.charAt(x) == 'X') || (sonnet3.charAt(x) == 'Y')
                    || (sonnet3.charAt(x) == 'Z')) {
                numberOfLetters++;
            } else {
            }
        }

        //Text is stored in this string with out spaces
        String wordsWithoutSeparating = sonnet3;
        //To replace all the puntuation mark
        wordsWithoutSeparating = wordsWithoutSeparating.replaceAll("'", "")
                .replaceAll(",", "").replaceAll(":", "").replaceAll(";", "")
                .replaceAll("\\?", "").replaceAll("\\.", "").replaceAll("\\(", "")
                .replaceAll("\\)", "").replaceAll("!", "");

        // This array stores each word of the text file
        String[] wordsWithoutSymbol = wordsWithoutSeparating.split(" ");

        int even = 0; // to count the even words
        int odd = 0; // to count the odd words
        String evenWords = ""; // to add  even words
        String oddWords = ""; // to add odd words
        //To separate even and odd words:     
        String[] evenWordsSeparated;//to store all the even words separated
        String[] oddWordsSeparated;//to store the odd words separated

        for (int i = 0; i < wordsWithoutSymbol.length; i++) {
            if (wordsWithoutSymbol[i].length() % 2 == 0) {
                even++;
                evenWords += wordsWithoutSymbol[i] + " ";
            } else {
                odd++;
                oddWords += wordsWithoutSymbol[i] + " ";
            }
        }

        Arrays.sort(wordsWithoutSymbol);

        //to introduce all the separated words inside their respective String array
        evenWordsSeparated = evenWords.split(" ");
        oddWordsSeparated = oddWords.split(" ");


        //output
        System.out.println("File analysed: " + "sonnet3.txt");
        System.out.println("There were " + words.countTokens()
                + " words and " + numberOfLetters + " letters.");
        System.out.println("There were " + even
                + " even words, and " + odd + " odd words.");

        System.out.println(Arrays.toString(evenWordsSeparated));
        System.out.println(Arrays.toString(oddWordsSeparated));

    

        Map<String, Integer> wordOccurrences = new HashMap<String, Integer>(wordsWithoutSymbol.length);

        for (String word : wordsWithoutSymbol) {
            if (wordOccurrences.containsKey(word)) {
                wordOccurrences.put(word, wordOccurrences.get(word) + 1);
            } else {
                wordOccurrences.put(word, 1);
            }
        }
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) == 1) {
                System.out.println("Word: " + word + "  [1]");
            }
        }
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) == 2) {
                System.out.println("Word: " + word + "  [2]");
            }
        }
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) == 3) {
                System.out.println("Word: " + word + "  [3]");
            }
        }
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) == 4) {
                System.out.println("Word: " + word + "  [4]");
            }
        }
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) == 5) {
                System.out.println("Word: " + word + "  [5]");
            }
        }
        String fourOrMore = "";
        for (String word : wordOccurrences.keySet()) {
            if (wordOccurrences.get(word) > 3) {
                fourOrMore += word + " ";
            }
        }
        
        String[] moreFrequented = fourOrMore.split(" ");
        ArrayList<String> ListOfMoreFrequented = new ArrayList<String>();
        for (int i = 0; i < moreFrequented.length; i++) {
            ListOfMoreFrequented.add(moreFrequented[i]);}
            
        System.out.println("Most frecuented words: " + ListOfMoreFrequented);

        //To store the results in a text file:
        String FileName = "results.txt";
        try {
            PrintWriter outputStream = new PrintWriter(FileName);
            outputStream.println("Task 3:");
            outputStream.println("File analysed: " + "sonnet3.txt");
            outputStream.println("There were " + words.countTokens()
                    + " words and " + numberOfLetters + " letters.");
            outputStream.println("There were " + even
                    + " even words, and " + odd + " odd words.");
            outputStream.println("WORDS FREQUENCY: ");
            
            Map<String, Integer> wordOccurrences2 = new HashMap<String, Integer>(wordsWithoutSymbol.length);
           //to display each word in the text file
            for (String word : wordsWithoutSymbol) {
                if (wordOccurrences2.containsKey(word)) {
                    wordOccurrences2.put(word, wordOccurrences2.get(word) + 1);
                } else {
                    wordOccurrences2.put(word, 1);
                }
            }

            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) == 1) {
                    outputStream.println("Word: " + word + "  [1]");
                }
            }

            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) == 2) {
                    outputStream.println("Word: " + word + "  [2]");
                }
            }

            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) == 3) {
                    outputStream.println("Word: " + word + "  [3]");
                }
            }
            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) == 4) {
                    outputStream.println("Word: " + word + "  [4]");
                }
            }

            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) == 5) {
                    outputStream.println("Word: " + word + "  [5]");
                }
            }

            for (String word : wordOccurrences2.keySet()) {
                if (wordOccurrences2.get(word) > 3) {
                    fourOrMore += word + " ";

                }
            }
            outputStream.println("Most frecuented words: " + ListOfMoreFrequented);

            outputStream.close(); // this push the information that outputstream stored in the ram

            System.out.println("\nText file results.txt has been created.");
        } catch (FileNotFoundException e) {
        }
    }

}

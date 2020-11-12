package Application_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author Bryan Chontasi
 */
public class Application_2 {

    public static void main(String[] args) {
        //As in task 1, I have created a class called readDocumentRxt to read the document.
        readDocumentTxt a = new readDocumentTxt();

        String sonnet1b = a.readTxt("sonnet1-b.txt").toUpperCase();
        

        // To count the words in the text I used StringTokenizer class
        StringTokenizer words = new StringTokenizer(sonnet1b);

        //To count the number of letters:
        int numberOfLetters = 0;

        // And I used this for function to count how many letters were in the text.
        for (int x = 0; x < sonnet1b.length(); x++) {
            if ((sonnet1b.charAt(x) == 'A') || (sonnet1b.charAt(x) == 'B') 
                    || (sonnet1b.charAt(x) == 'C')
                    || (sonnet1b.charAt(x) == 'D') || (sonnet1b.charAt(x) == 'E')
                    || (sonnet1b.charAt(x) == 'F') || (sonnet1b.charAt(x) == 'G')
                    || (sonnet1b.charAt(x) == 'H') || (sonnet1b.charAt(x) == 'I')
                    || (sonnet1b.charAt(x) == 'J') || (sonnet1b.charAt(x) == 'K')
                    || (sonnet1b.charAt(x) == 'L') || (sonnet1b.charAt(x) == 'M')
                    || (sonnet1b.charAt(x) == 'N') || (sonnet1b.charAt(x) == 'O')
                    || (sonnet1b.charAt(x) == 'P') || (sonnet1b.charAt(x) == 'Q')
                    || (sonnet1b.charAt(x) == 'R') || (sonnet1b.charAt(x) == 'S')
                    || (sonnet1b.charAt(x) == 'T') || (sonnet1b.charAt(x) == 'U')
                    || (sonnet1b.charAt(x) == 'V') || (sonnet1b.charAt(x) == 'W')
                    || (sonnet1b.charAt(x) == 'X') || (sonnet1b.charAt(x) == 'Y')
                    || (sonnet1b.charAt(x) == 'Z')) {
                numberOfLetters++;
            } else {
            }
        }

        //To separate even and odd words:
        int even = 0; // to count the even words
        int odd = 0; // to count the odd words

        String evenWords = ""; // to add  even words
        String oddWords = ""; // to add odd words

        String[] wordsSeparated; // an array to store each word of the text file
        String[] evenWordsSeparated;//to store all the even words separated
        String[] oddWordsSeparated;//to store the odd words separated

        //To put my text inside this string to make my code easier to understand
        String wordsWithoutSeparating = sonnet1b;
        //To replace all the puntuation mark
        wordsWithoutSeparating = wordsWithoutSeparating.replaceAll("'", "")
                .replaceAll(",","").replaceAll(":","").replaceAll(";","")
                .replaceAll("\\?","").replaceAll("\\.","");

        //This asign all the words separated from my text to wordSeparated array
        wordsSeparated = wordsWithoutSeparating.split(" ");

        //This for loop  counts how manny even and odd words there are, 
        //And separates even and odd words  inside different strings
        for (int i = 0; i < wordsSeparated.length; i++) {
            if (wordsSeparated[i].length() % 2 == 0) {
                even++;
                evenWords += wordsSeparated[i] + " ";
            } else {
                odd++;
                oddWords += wordsSeparated[i] + " ";
            }
        }

        //to insert all the separated words inside their respective String array
        evenWordsSeparated = evenWords.split(" ");
        oddWordsSeparated = oddWords.split(" ");

        //To remove duplicates I created a method called RemoveDuplicates
        //I created two new string to store the words without duplicates
        String[] evenWithoutDuplicates = RemoveDuplicates(evenWordsSeparated);
        String[] oddWithoutDuplicates = RemoveDuplicates(oddWordsSeparated);

        //Two ArrayList to store the arrays as ArrayLists
        ArrayList<String> setOfOddWithoutDuplicate = new ArrayList<String>();
        for (int j = 0; j < oddWithoutDuplicates.length; j++) {
            setOfOddWithoutDuplicate.add(oddWithoutDuplicates[j]);
        }
        ArrayList<String> setOfEvenWithoutDuplicate = new ArrayList<String>();
        for (int j = 0; j < evenWithoutDuplicates.length; j++) {
            setOfEvenWithoutDuplicate.add(evenWithoutDuplicates[j]);
        }
        //To put the sets in alphabetical order I  used Collections .
        Collections.sort(setOfEvenWithoutDuplicate);
        Collections.sort(setOfOddWithoutDuplicate);

        //TASK 2: ADDITIONAL:
        //To read the new sonnet I called the class readDocument
        readDocumentTxt b = new readDocumentTxt();
        //To store the text of the sonnet in a string called sonnet 2 in UpperCase
        String sonnet2 = a.readTxt("sonnet2.txt").toUpperCase();

        
        //To count the number of letters
        int numberOfLettersSonnet2 = 0;
        //To count the letters I used a for loop:
        for (int x = 0; x < sonnet2.length(); x++) {
            if ((sonnet2.charAt(x) == 'A') || (sonnet2.charAt(x) == 'B') || (sonnet2.charAt(x) == 'C')
                    || (sonnet2.charAt(x) == 'D') || (sonnet2.charAt(x) == 'E')
                    || (sonnet2.charAt(x) == 'F') || (sonnet2.charAt(x) == 'G')
                    || (sonnet2.charAt(x) == 'H') || (sonnet2.charAt(x) == 'I')
                    || (sonnet2.charAt(x) == 'J') || (sonnet2.charAt(x) == 'K')
                    || (sonnet2.charAt(x) == 'L') || (sonnet2.charAt(x) == 'M')
                    || (sonnet2.charAt(x) == 'N') || (sonnet2.charAt(x) == 'O')
                    || (sonnet2.charAt(x) == 'P') || (sonnet2.charAt(x) == 'Q')
                    || (sonnet2.charAt(x) == 'R') || (sonnet2.charAt(x) == 'S')
                    || (sonnet2.charAt(x) == 'T') || (sonnet2.charAt(x) == 'U')
                    || (sonnet2.charAt(x) == 'V') || (sonnet2.charAt(x) == 'W')
                    || (sonnet2.charAt(x) == 'X') || (sonnet2.charAt(x) == 'Y')
                    || (sonnet2.charAt(x) == 'Z')) {
                numberOfLettersSonnet2++;
            } else {
            }
        }

        //I created an string that includes all the simbols that I want to delete from the text;
        String symbolsToDelete = "[ -.,;?!¡\'\"\\[\\]]+";
        //I created an array to store the words separated without symbols and spaces
        String[] wordsSeparatedOfSymbolsAndSpaces = sonnet2.split(symbolsToDelete);

        String evenWordsWithoutSymbol = ""; // To add all the even words without symbols
        String oddWordsWithoutSymbol = ""; // To add all the odd words without symbols

        int numberOfWordsWithoutSimbols = 0; //To count the words
        int evenWordsSonnet2 = 0;   // To count how many even words there are
        int oddWordsSonnet2 = 0;    //To count how many odd words there are

        for (int i = 0; i < wordsSeparatedOfSymbolsAndSpaces.length; i++) {
            if (wordsSeparatedOfSymbolsAndSpaces[i].length() % 2 == 0) {
                numberOfWordsWithoutSimbols++;
                evenWordsSonnet2++;
                evenWordsWithoutSymbol += wordsSeparatedOfSymbolsAndSpaces[i] + " ";
            } else {

                numberOfWordsWithoutSimbols++;
                oddWordsSonnet2++;
                oddWordsWithoutSymbol += wordsSeparatedOfSymbolsAndSpaces[i] + " ";
            }

        }
        //two String array to store the even and odd words without any symbol
        String[] evenWordsWithoutSeparated2 = evenWordsWithoutSymbol.split(symbolsToDelete);
        String[] oddWordsWithoutSeparated2 = oddWordsWithoutSymbol.split(symbolsToDelete);

        //To remove duplicates i use the class RemoveDuplicates
        //And  store the words without dulpicates in a String array
        String[] evenWithoutDuplicates2 = RemoveDuplicates(evenWordsWithoutSeparated2);
        String[] oddWithoutDuplicates2 = RemoveDuplicates(oddWordsWithoutSeparated2);

        //Toconvert the string arrays into an ArrayList
        ArrayList<String> setOfEvenWithoutDuplicateAndSymbols = new ArrayList<String>();
        for (int j = 0; j < evenWithoutDuplicates2.length; j++) {
            setOfEvenWithoutDuplicateAndSymbols.add(evenWithoutDuplicates2[j]);
        }

        ArrayList<String> setOfOddWithoutDuplicateAndSymbols = new ArrayList<String>();
        for (int j = 0; j < oddWithoutDuplicates2.length; j++) {
            setOfOddWithoutDuplicateAndSymbols.add(oddWithoutDuplicates2[j]);
        }
        // Collections class to put the words in alphabetical order
        Collections.sort(setOfEvenWithoutDuplicateAndSymbols);
        Collections.sort(setOfOddWithoutDuplicateAndSymbols);

        //<<<<<<<<<<<<<<<<<<<<<   OUTPUT    >>>>>>>>>>>>>>>>>>>>>>>>
        //TASK 2
        System.out.println("File analysed: " + "sonnet1-b.txt");
        System.out.println("There were " + words.countTokens()
                + " words and " + numberOfLetters + " letters.");
        System.out.println("There were " + even
                + " even words, and " + odd + " odd words.");

        System.out.println("Set of even words: " + setOfEvenWithoutDuplicate);
        System.out.println("Set of odds words: " + setOfOddWithoutDuplicate);

        //TASK 2 ADDITIONAL
        System.out.println("\nFile analysed: " + "sonnet2.txt");
        System.out.println("There were " + numberOfWordsWithoutSimbols + " words and " + numberOfLettersSonnet2 + " letters");
        System.out.println("There were " + evenWordsSonnet2
                + " even words, and " + oddWordsSonnet2 + " odd words");
        System.out.println("Set of even Words: " + setOfEvenWithoutDuplicateAndSymbols);
        System.out.println("Set of odd Words:  " + setOfOddWithoutDuplicateAndSymbols);

        //To store the results in a text file:
        String FileName = "results.txt";
        try {
            PrintWriter outputStream = new PrintWriter(FileName);
            outputStream.println("Task 2:");
            outputStream.println("File analysed: " + "sonnet1-b.txt");
            outputStream.println("There were " + words.countTokens()
                    + " words and " + numberOfLetters + " letters");
            outputStream.println("There were " + even
                    + " even words, and " + odd + " odd words");
            outputStream.println("Set of even words: " + setOfEvenWithoutDuplicate);
            outputStream.println("Set of odds words: " + setOfOddWithoutDuplicate);
            outputStream.println(" ");
            outputStream.println("Task 2 additional task:");
            outputStream.println("\nFile analysed: " + "sonnet2.txt");
            outputStream.println("There were " + numberOfWordsWithoutSimbols + " words and " + numberOfLettersSonnet2 + " letters.");
            outputStream.println("There were " + evenWordsSonnet2
                    + " even words, and " + oddWordsSonnet2 + " odd words.");
            outputStream.println("Set of even Words: " + setOfEvenWithoutDuplicateAndSymbols);
            outputStream.println("Set of odd Words:  " + setOfOddWithoutDuplicateAndSymbols);

            outputStream.close(); // this push the information that outputstream stored in the ram

            System.out.println("\nText file results.txt has been created.");
        } catch (FileNotFoundException e) {
        }

    }

    public static String[] RemoveDuplicates(String[] list) {

        int end = list.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (list[i].equals(list[j])) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        list[shiftLeft] = list[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        String[] whitelist = new String[end];
        for (int i = 0; i < end; i++) {
            whitelist[i] = list[i];
        }
        return whitelist;

    }
}

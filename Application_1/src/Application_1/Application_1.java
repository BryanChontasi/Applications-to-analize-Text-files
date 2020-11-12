package Application_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.*;

/**
 *
 * @author Bryan Chontasi
 */
public class Application_1 {

    public static void main(String[] args) {
        //To read a file with file class
        readDocumentTxt a = new readDocumentTxt();

        String sonnet1a = a.readTxt("sonnet1-a.txt");

        //To count how many words THERE ARE IN THE TEXT
       
        StringTokenizer words = new StringTokenizer(sonnet1a);

        // TO FIND OUT THE NUMBER OF LETTERS
        int numberOfLetters = 0;

        // lenght= length of the input -1 because the index starst in 0
        for (int i = sonnet1a.length() - 1; i >= 0; i--) {
            //the loop checks the words from right to left
            // first checks if it is space and consonant.
            switch (sonnet1a.toLowerCase().charAt(i)) {
                case ' ':
                    break;
                default:
                    numberOfLetters++;
                    break;
            }
        }

        //##################################################################
        //>>>>>>>>>TO BREAK UP WORDS AND COUNT EVEN AND ODD WORDS <<<<<<<<<<
        int even = 0; // to count the even words
        int odd = 0; // to count the odd words

        String evenWords = ""; // to add even words
        String oddWords = ""; // to add odd words

        String[] wordsSeparated; // an array to store  each word of the text file
        //
        String[] evenWordsSeparated;//an array to store all the even words
        String[] oddWordsSeparated;//to store the odd words

        //I put my text inside this string, it will store with no spaces 
        String wordsWithoutSeparating = sonnet1a;

        //I asign all the words separated from my text to wordSeparated array
        wordsSeparated = wordsWithoutSeparating.split(" ");

        //I create a for loop to count how manny even and odd word there are and
        //to separate even and odd words  inside different strings
        for (int i = 0; i < wordsSeparated.length; i++) {
            if (wordsSeparated[i].length() % 2 == 0) {
                even++;
                evenWords += wordsSeparated[i] + " ";
            } else {
                odd++;
                oddWords += wordsSeparated[i] + " ";
            }
        }
        //I create this two strings to make the even and odd words in UpperCase
        String upperCaseEven = evenWords.toUpperCase();
        String upperCaseOdd = oddWords.toUpperCase();

        //To introduce all the separated words inside the array with an space
        evenWordsSeparated = upperCaseEven.split(" ");
        oddWordsSeparated = upperCaseOdd.split(" ");

        //To remove duplicates I created a method called EliminateDuplicates (method is at the end of the code)
        //I created  a string to introduce the odd and even without duplicates
        String[] evenWithoutDuplicates = EliminateDuplicates(evenWordsSeparated);
        String[] oddWithoutDuplicates = EliminateDuplicates(oddWordsSeparated);

        //then I create two ArrayList to save the sets
        ArrayList<String> setOfOddWithoutDuplicate = new ArrayList<String>();
        for (int j = 0; j < oddWithoutDuplicates.length; j++) {
            setOfOddWithoutDuplicate.add(oddWithoutDuplicates[j]);
        }
        ArrayList<String> setOfEvenWithoutDuplicate = new ArrayList<String>();
        for (int j = 0; j < evenWithoutDuplicates.length; j++) {
            setOfEvenWithoutDuplicate.add(evenWithoutDuplicates[j]);
        }

        //#####################################################################     
        //to pass even and odd into a set
        ArrayList<String> setOfEven = new ArrayList<String>();
        for (int j = 0; j < evenWordsSeparated.length; j++) {
            setOfEven.add(evenWordsSeparated[j]);
        }

        ArrayList<String> setOfOdd = new ArrayList<String>();
        for (int i = 0; i < oddWordsSeparated.length; i++) {
            setOfOdd.add(oddWordsSeparated[i]);
        }
        // to put the sets in alphabetical order.
        Collections.sort(setOfEvenWithoutDuplicate);
        Collections.sort(setOfOddWithoutDuplicate);
        Collections.sort(setOfEven);
        Collections.sort(setOfOdd);

       
        //<<<<<<<<<<<<<<<<<<<<<   OUTPUT CONSOLE   >>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("File analysed: " + "sonnet1-a.txt");
        System.out.println("There were " + words.countTokens()
                + " words and " + numberOfLetters + " letters");
        System.out.println("There were " + even
                + " even words, and " + odd + " odd words");
        //  System.out.println("Set of even words: " + setOfEven );
        System.out.println("Set of even words: " + setOfEvenWithoutDuplicate);
        System.out.println("Set of odds words: " + setOfOddWithoutDuplicate);
        // System.out.println("Set of odd words:  " + setOfOdd );

        //<<<<<<<<<<<<<<<<<<<   OUTPUT IN A TEXT FILE   >>>>>>>>>>>>>>>>>>>>>>>>
        
        String FileName = "results.txt"; //Name of the file to be created
        try {
            PrintWriter outputStream = new PrintWriter(FileName); //creates the text file
            outputStream.println("File analysed: " + "sonnet1-a.txt");
            outputStream.println("There were " + words.countTokens()
                    + " words and " + numberOfLetters + " letters");
            outputStream.println("There were " + even
                + " even words, and " + odd + " odd words");
            outputStream.println("Set of even words: " + setOfEvenWithoutDuplicate);
            outputStream.println("Set of odds words: " + setOfOddWithoutDuplicate);
            outputStream.close(); // this push the information that outputstream stored in the ram

            System.out.print("file results.txt has been created");
        } catch (FileNotFoundException e) {
        }

    }
    
    //Method to Eliminate duplicates
    public static String[] EliminateDuplicates(String[] list) {

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
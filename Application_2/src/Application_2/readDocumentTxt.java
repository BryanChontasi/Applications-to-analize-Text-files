package Application_2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Bryan Chontasi
 */
public class readDocumentTxt {
    public String readTxt(String direction) { //file direction
        String text = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {   //it makes the loop work while bfRead has data 
                temp = temp + bfRead + " "; // text is stored in the file
                // the space is to break up the words of the text
            }
            text = temp;
        } catch (Exception e) {
            System.err.println("File was not found");
        }

        return (text);
    }
}

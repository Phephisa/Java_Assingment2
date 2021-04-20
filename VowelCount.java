
package lab7;

/**
 *
 * Phephisa Methula 18000797
 * Question 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;


public class VowelCount {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfLines = new ArrayList<>();

        // create a reader to read through te txt fil
        try (BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\DELL\\dev\\java\\COMP 311\\src\\lab8\\file.txt"))) {
            String line = bufReader.readLine();
            while (line != null) {
                // add every read line into arraylist
                listOfLines.add(line);
                line = bufReader.readLine();
            }
            // close reader
            bufReader.close();
        }

        // System.out.println(listOfLines);

        // Sum variable
        int sum = 0;
        // loop through arraylist with string values
        for (int i = 0; i < listOfLines.size(); i++) {
            // Store the value of each string in the variable
            String s = listOfLines.get(i);
            // Vowel variable
            int vowel = 0;
            for (int j = 0; j < s.length(); j++) {
                // System.out.println(s.charAt(j));
                char indx, ch;
                // get the the charater at the index
                indx = s.charAt(j);
                // convert all char to lowercase
                ch = Character.toLowerCase(indx);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                }

            }
            // add the number of vowels to sum
            sum += vowel;
            // print the values of each vowel in the string
            System.out.println("Sentence " + (i + 1) + " has " + vowel + " vowels");
        }
        // print the sum
        System.out.println("The total number of vowels are " + sum);
    }

}

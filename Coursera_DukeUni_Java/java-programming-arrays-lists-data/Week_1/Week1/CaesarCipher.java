
/**
 * Beschreiben Sie hier die Klasse CaesarCipher.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import edu.duke.*;

public class CaesarCipher {
    public String encrypt(String input, int key){
        //Make a Stringbuilder with mesage(encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Compute the stifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        // Count 0 to < length of encrypted, ( call it i)
        for (int i =0; i<encrypted.length();i++){
            // Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
                // If currChar is in the alphabet
                if (idx != -1){
                // Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //REplace the ith character of encrypted with
                encrypted.setCharAt(i, newChar);
                } 
            
                //Otherwise: do nothing 
        }
        // Your answer it the String inside of encrypted
        return encrypted.toString();
    }
    
    public void testCaesar(){
        int key = 12;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        String decrypted = encrypt(encrypted,26-key);
        System.out.println(decrypted);
    }
}

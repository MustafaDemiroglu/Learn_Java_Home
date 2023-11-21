
/**
 * Beschreiben Sie hier die Klasse CaesarCipher.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import edu.duke.*;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

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
            if(isLowerCase(currChar)){
                //Find the index of currChar in the alphabet (call it idx)
                int idx = alphabet.indexOf(toUpperCase(currChar));
                // If currChar is in the alphabet
                if (idx != -1){
                    // Get the idxth character of shiftedAlphabet (newChar)
                    char newChar = shiftedAlphabet.charAt(idx);
                    //REplace the ith character of encrypted with
                    encrypted.setCharAt(i, toLowerCase(newChar));
                }

                //Otherwise: do nothing
            } else {
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
        }
        // Your answer it the String inside of encrypted
        return encrypted.toString();
    }
    
    public static  String encryptTwoKeys(String input, int key1, int key2){
        //Make a Stringbuilder with mesage(encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Compute the stifted alphabet
        String shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        // Count 0 to < length of encrypted, ( call it i)
        for (int i =0; i<encrypted.length();i++){
            // Look at the ith character of encrypted (call it currChar)
            if (i %2 == 0) {
                char currChar = encrypted.charAt(i);
                if(isLowerCase(currChar)){
                    //Find the index of currChar in the alphabet (call it idx)
                    int idx = alphabet.indexOf(toUpperCase(currChar));
                    // If currChar is in the alphabet
                    if (idx != -1){
                        // Get the idxth character of shiftedAlphabet1 (newChar)
                        char newChar = shiftedAlphabet1.charAt(idx);
                        //REplace the ith character of encrypted with
                        encrypted.setCharAt(i, toLowerCase(newChar));
                    }

                    //Otherwise: do nothing
                } else {
                    //Find the index of currChar in the alphabet (call it idx)
                    int idx = alphabet.indexOf(currChar);
                    // If currChar is in the alphabet
                    if (idx != -1){
                        // Get the idxth character of shiftedAlphabet1 (newChar)
                        char newChar = shiftedAlphabet1.charAt(idx);
                        //REplace the ith character of encrypted with
                        encrypted.setCharAt(i, newChar);
                    }

                    //Otherwise: do nothing
                }
            } else {
                char currChar = encrypted.charAt(i);
                if(isLowerCase(currChar)){
                    //Find the index of currChar in the alphabet (call it idx)
                    int idx = alphabet.indexOf(toUpperCase(currChar));
                    // If currChar is in the alphabet
                    if (idx != -1){
                        // Get the idxth character of shiftedAlphabet2 (newChar)
                        char newChar = shiftedAlphabet2.charAt(idx);
                        //REplace the ith character of encrypted with
                        encrypted.setCharAt(i, toLowerCase(newChar));
                    }

                    //Otherwise: do nothing
                } else {
                    //Find the index of currChar in the alphabet (call it idx)
                    int idx = alphabet.indexOf(currChar);
                    // If currChar is in the alphabet
                    if (idx != -1){
                        // Get the idxth character of shiftedAlphabet2 (newChar)
                        char newChar = shiftedAlphabet2.charAt(idx);
                        //REplace the ith character of encrypted with
                        encrypted.setCharAt(i, newChar);
                    }

                    //Otherwise: do nothing
                }
            }

        }
        // Your answer it the String inside of encrypted
        return encrypted.toString();
    }
    
    public void eyeballDecrypt(String encrypted){
        CaesarCipher cipher = new CaesarCipher();
        for(int k=0; k<26;k++){
            String s = cipher.encrypt(encrypted,k);
            System.out.println(k+"\t"+s);
        }
    }
    
    public void testEyeballDecrypt(){
        eyeballDecrypt("Lujyfwapvu huk zljbypaf");
    }
    
    public void testCaesar(){
        int key = 12;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
        String decrypted = encrypt(encrypted,26-key);
        System.out.println(decrypted);
    }
    
    public void testEncrypt(){
        System.out.println(encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));
    }
    
    public void testEncryptTwoKeys(){
        System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",8, 21));
    }
}

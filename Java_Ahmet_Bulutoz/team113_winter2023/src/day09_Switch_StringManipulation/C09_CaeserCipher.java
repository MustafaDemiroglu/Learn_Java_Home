package day09_Switch_StringManipulation;

import static java.lang.Character.*;

public class C09_CaeserCipher {

    public static String encrypt(String input, int key){
        //Make a Stringbuilder with messgiage(encrypted)
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
    public static void main(String[] args) {
        System.out.println(encrypt("First Legion", 17));
        System.out.println(encryptTwoKeys("First Legion", 23, 17));
    }

}

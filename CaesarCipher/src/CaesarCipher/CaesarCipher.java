package CaesarCipher;

public class CaesarCipher {
    private String alphabet;
    private String shiftedAlphabet;
    public CaesarCipher (int key){
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
    }
}

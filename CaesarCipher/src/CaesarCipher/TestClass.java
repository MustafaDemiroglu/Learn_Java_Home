package CaesarCipher;

import static CaesarCipher.CaesarCipher.*;

public class TestClass {
    public static void main(String[] args) {
        // Example usage
        int key = 3;
        CaesarCipher cipher = new CaesarCipher(key);

        String message = "HELLO WORLD";
        String encryptedMessage = cipher.encrypt(message);
        String decryptedMessage = cipher.decrypt(encryptedMessage);

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);

        System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",8, 21));
        System.out.println(encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));

        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
        String decrypted = encrypt(encrypted,26-key);
        System.out.println(decrypted);

        eyeballDecrypt("Lujyfwapvu huk zljbypaf");
        eyeballDecrypt("Gwpv c vbuq pvokki yfve iqqu qc bgbgbgbgbgbgbgbgbu");

    }
}

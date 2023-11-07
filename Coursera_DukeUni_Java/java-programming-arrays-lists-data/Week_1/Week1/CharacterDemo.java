
/**
 * Beschreiben Sie hier die Klasse CharacterDemo.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CharacterDemo {
    public void digitTest(){
        String test = "ABCabc0123456789';#!";
        for(int k=0; k<test.length(); k++){ 
            char ch = test.charAt(k);
            if (Character.isDigit(ch)){
                System.out.println(ch + " is a digit");
            }
            if (Character.isAlphabetic(ch)){
                System.out.println(ch + " is alphabetic");
            }
        }
    }
}

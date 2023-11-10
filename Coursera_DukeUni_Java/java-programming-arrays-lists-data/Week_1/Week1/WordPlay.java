
/**
 * Beschreiben Sie hier die Klasse WordPlay.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WordPlay {
    public boolean isVowel(char ch){
        String vowels = "AEIOUaeiou";
        boolean isCharVowel = true;
        for(int i=0; i<vowels.length();i++){
            char currChar = vowels.charAt(i);
            if(ch == currChar){
                isCharVowel = true;
                break;
            }else{
                isCharVowel = false;
            }
        }
        return isCharVowel;
    }
    
    public void testVowel(){
        System.out.println("is c Vogel ? : " + isVowel('c'));
        System.out.println("is a Vogel ? : " + isVowel('a'));
        System.out.println("is E Vogel ? : " + isVowel('E'));
        System.out.println("is K Vogel ? : " + isVowel('K'));
        System.out.println("is O Vogel ? : " + isVowel('O'));
        System.out.println("is i Vogel ? : " + isVowel('i'));
        System.out.println("is p Vogel ? : " + isVowel('p'));
        System.out.println("is S Vogel ? : " + isVowel('S'));
        System.out.println("is u Vogel ? : " + isVowel('u'));
        System.out.println("is o Vogel ? : " + isVowel('o'));
        System.out.println("is E Vogel ? : " + isVowel('E'));
        System.out.println("is I Vogel ? : " + isVowel('I'));
    }
    
    public String replaceVowels(String phrase, char ch){
        String vowels = "AEIOUaeiou";
        boolean isCharVowel = true;
        String newphrase = "";
            for(int i=0; i<phrase.length();i++){
                char currChar = phrase.charAt(i);
                if(isVowel(currChar)){
                    newphrase = newphrase + ch;
                }else{
                    newphrase = newphrase + phrase.charAt(i);
                }
            }
        return newphrase;
    }
    
    public void testReplaceVowels(){
        System.out.println(replaceVowels("Hello World", '*'));
    }
    
    public String emphasize(String phrase, char ch){
        String newphrase = "";
        for(int i=0; i<phrase.length();i++){
                char currChar = phrase.charAt(i);
                if(currChar != ch){
                    newphrase = newphrase + currChar;
                }else{
                    if(i %2 !=0){
                    newphrase = newphrase + '+';
                    } else {
                        newphrase = newphrase + '*';
                    }
                }
        }
        return newphrase;
    }
    
    public void testemphasize(){
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
        

}

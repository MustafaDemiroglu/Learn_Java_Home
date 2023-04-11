
/**
 * Beschreiben Sie hier die Klasse findAbc3.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class findAbc3 {
    public void findAbc(String input){
        int index = input.indexOf("abc");
        while (index != -1){
            if (index > input.length() - 4){
                break;
            }
            String found = input.substring(index+3, index+6);
            System.out.println(found);
            index = input.indexOf("abc", index+1);
        }
    }
    
    public void test(){
       //findAbc("abcd");
       //findAbc("abcdabc");
       findAbc("abcabcabcabca");
   }
}

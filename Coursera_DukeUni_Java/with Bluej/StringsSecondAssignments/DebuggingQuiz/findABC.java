
/**
 * Beschreiben Sie hier die Klasse findABC.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class findABC {
    public void findAbc(String input) {
    int index = input.indexOf("abc");
    while (true) {
        if (index == -1) {
            break;
        }
        String found = input.substring(index+1, index+4);
        System.out.println(found);
        System.out.println(input.length());
        index = input.indexOf("abc", index+4);
        
    }
}
   public void test() {
    //no code yet
    findAbc("abcdabc");
}
}

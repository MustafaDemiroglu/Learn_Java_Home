
/**
 * Beschreiben Sie hier die Klasse Part3.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Part3 {
    public static boolean twoOccurrences(String stringa, String stringb) {
    int count = 0;
    int index = 0;
    while (true) {
        index = stringb.indexOf(stringa, index);
        if (index != -1) {
            count++;
            index += stringa.length();
        } else {
            break;
        }
    }
    return count >= 2;
}

    public static String lastPart(String stringa, String stringb) {
    int index = stringb.indexOf(stringa);
    if (index == -1) { // stringa not found in stringb
        return stringb;
    } else { // stringa found in stringb
        return stringb.substring(index + stringa.length());
    }
}    

    public void testing() {
    String stringa = "by";
    String stringb = "A story by Abby Long";
    System.out.println("The part of the string after " + stringa + " in " + stringb + " is: " + lastPart(stringa, stringb));
    
    stringa = "an";
    stringb = "banana";
    System.out.println("The part of the string after " + stringa + " in " + stringb + " is: " + lastPart(stringa, stringb));
    
    stringa = "zoo";
    stringb = "forest";
    System.out.println("The part of the string after " + stringa + " in " + stringb + " is: " + lastPart(stringa, stringb));
}

}

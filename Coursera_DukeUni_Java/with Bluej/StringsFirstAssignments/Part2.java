
/**
 * Beschreiben Sie hier die Klasse Part2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Part2 {
    public static String findSimpleGene(String dna, String startCodon, String stopCodon) {
    String result = "";
    int startIndex = dna.indexOf(startCodon);
    if (startIndex == -1) { // no start codon found
        return result;
    }
    int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
    if (stopIndex == -1) { // no stop codon found
        return result;
    }
    if ((stopIndex - startIndex) % 3 == 0) { // gene found
        result = dna.substring(startIndex, stopIndex + 3);
    }
    if (Character.isUpperCase(dna.charAt(startIndex))) {
        return result.toUpperCase();
    } else {
        return result.toLowerCase();
    }
}

    public static void testSimpleGene() {
    String dna1 = "ATGGGTTAAGTC";
    String dna2 = "gatgctataat";
    String dna3 = "ATGGGTTAGTC";
    String dna4 = "gatgctataatg";
    String dna5 = "ATGGGTTAAG";
    String startCodon = "ATG";
    String stopCodon = "TAA";

    System.out.println("DNA strand: " + dna1);
    System.out.println("Gene: " + findSimpleGene(dna1, startCodon, stopCodon));

    System.out.println("DNA strand: " + dna2);
    System.out.println("Gene: " + findSimpleGene(dna2, startCodon, stopCodon));

    System.out.println("DNA strand: " + dna3);
    System.out.println("Gene: " + findSimpleGene(dna3, startCodon, stopCodon));

    System.out.println("DNA strand: " + dna4);
    System.out.println("Gene: " + findSimpleGene(dna4, startCodon, stopCodon));

    System.out.println("DNA strand: " + dna5);
    System.out.println("Gene: " + findSimpleGene(dna5, startCodon, stopCodon));
}

}

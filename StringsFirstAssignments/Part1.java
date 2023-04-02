
/**
 * Beschreiben Sie hier die Klasse Part1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
    int startIndex = dna.indexOf("ATG");
    if (startIndex == -1) { // no ATG
        return "";
    }
    int stopIndex = dna.indexOf("TAA", startIndex + 3);
    if (stopIndex == -1) { // no TAA
        return "";
    }
    if ((stopIndex - startIndex) % 3 == 0) {
        return dna.substring(startIndex, stopIndex + 3);
    } else {
        return "";
    }
}
    
    public void testSimpleGene() {
    String dna1 = "ATCGTAGCTAGCTAGC"; // no TAA
    String dna2 = "ATGCTAGCTAGCTAGC"; // no TAA
    String dna3 = "ATCGTAGCTAGCTAGC"; // no ATG or TAA
    String dna4 = "ATGCTAGCTAACTAGC"; // valid gene
    String dna5 = "ATGCTAGCTAGCTAGCTAA"; // invalid gene
    
    String[] dnas = {dna1, dna2, dna3, dna4, dna5};
    for (String dna : dnas) {
        System.out.println("DNA String: " + dna);
        String gene = findSimpleGene(dna);
        if (gene.isEmpty()) {
            System.out.println("No gene found.");
        } else {
            System.out.println("Gene found: " + gene);
        }
    }
}

    
}

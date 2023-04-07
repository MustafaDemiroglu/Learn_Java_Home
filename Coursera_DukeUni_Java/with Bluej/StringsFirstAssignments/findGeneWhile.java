import edu.duke.*;
/**
 * Beschreiben Sie hier die Klasse findGeneWhile.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class findGeneWhile {
    public String findGene(String dna){
    //Find first occurence of "ATG" call its index "startIndex"
    int startIndex = dna.indexOf("ATG");
    //Find the "TAA" startting from "startIndex+3", call this resuöt currIndex 
    int currIndex = dna.indexOf("TAA", startIndex+3);
    //As long as currIndex is not equal to -1
    while(currIndex != -1){
        //Check if (currIndex - startIndex) is a multiple of 3
        if ((currIndex - startIndex) % 3 == 0) {
            //if so, the text between startIndex and currIndex+3 is your Answer
            return dna.substring (startIndex, currIndex + 3);
        }
            //if not, updaste currIndex to the index of the next TAA, starting from (currIndex
            else {
                currIndex = dna.indexOf ("TAA", currIndex+1);
            }
    }
            //Your answer is the empty string
    return "";
} 

public void testfindGeneWhile() {
        String dna = "AATGCGTAATTAATCG";
        System.out.println("DNA strand is: " + dna);
        String gene = findGene(dna);
        System.out.println("Gene is: "+gene);
        
        dna = "CGATGGTTGATAAGCCTAAGCTATAA";
        System.out.println("DNA strand is: " + dna);
        gene = findGene(dna);
        System.out.println("Gene is: " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGene (dna);
        System.out.println("Gene is: " + gene);
        
        dna = "ATGTAA";
        System.out.println("DNA strand is: " + dna);
        gene = findGene (dna);
        System.out.println("Gene is: " + gene);
        
        dna = "TTATAA";
        System.out.println("DNA strand is: " + dna);
        gene = findGene(dna);
        System.out.println("Gene is: " + gene);
        
        dna = "CGATGGTTTAAAAGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGene(dna);
        System.out.println("Gene is: " + gene);
        
        dna = "CGATGGTTTGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGene(dna);
        System.out.println("Gene is: " + gene);
        
        dna = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println(" Quiz 1. DNA strand is: " + dna);
        gene = findGene(dna);
        System.out.println("Quiz 1 Gene is: " + gene);   
    } 
 } 
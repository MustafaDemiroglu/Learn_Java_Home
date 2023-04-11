
/**
 * 
 * @author Mustafa Demiroglu
 * @version 11.04.2023
 * 
 * * Beschreiben Sie hier die Klasse Part3.
 * Part 3: How Many Genes?
 * Write a program to count how many genes are in a strand of DNA.
 * Specifically, you should do the following:
 * 1. Create a new Java Class named Part3 in the StringsSecondAssignments project. Put the following methods in this class.
 * 2. Copy your methods from Part1 to find one gene and print all genes.
 * 3. Write the method named countGenes that has a String parameter named dna representing a string of DNA. This method returns 
 * the number of genes found in dna. For example the call countGenes(“ATGTAAGATGCCCTAGT”) returns 2, finding the gene ATGTAA 
 * first and then the gene ATGCCCTAG. Hint: This is very similar to finding all genes and printing them, except that instead of 
 * printing all the genes you will count them.
 * 4. Write the void method named testCountGenes that has no parameters.  This method calls countGenes with many example 
 * strings and prints the result for each. You should create several examples with different numbers of genes to test your code.
 * 
 */
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return dna.length();
    }
    
    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = Math.min(Math.min(taaIndex, tagIndex), tgaIndex);
        if (minIndex == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }
    
    public void printAllGenes(String dna) {
        while (true) {
            String gene = findGene(dna);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            dna = dna.substring(dna.indexOf(gene) + gene.length());
        }
    }
    
    public int countGenes(String dna) {
        int count = 0;
        while (true) {
            String gene = findGene(dna);
            if (gene.isEmpty()) {
                break;
            }
            count++;
            dna = dna.substring(dna.indexOf(gene) + gene.length());
        }
        return count;
    }
    
    public void testCountGenes() {
        String dna1 = "ATGTAAGATGCCCTAGT";
        String dna2 = "ATGCTAGATGCGAGTAGCGTAG";
        String dna3 = "ATGCCCTAG";
        String dna4 = "ATGCTAGCGTAGCTAG";
        String dna5 = "TAGATGCCCTAGTAA";
        System.out.println("DNA strand: " + dna1);
        System.out.println("Number of genes: " + countGenes(dna1));
        System.out.println("DNA strand: " + dna2);
        System.out.println("Number of genes: " + countGenes(dna2));
        System.out.println("DNA strand: " + dna3);
        System.out.println("Number of genes: " + countGenes(dna3));
        System.out.println("DNA strand: " + dna4);
        System.out.println("Number of genes: " + countGenes(dna4));
        System.out.println("DNA strand: " + dna5);
        System.out.println("Number of genes: " + countGenes(dna5));
    }
}


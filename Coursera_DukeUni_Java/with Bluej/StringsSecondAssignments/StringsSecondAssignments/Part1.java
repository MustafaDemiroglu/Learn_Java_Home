
/**
 * * @author Mustafa Deiroglu  
 * @version 11.04.2023
 * 
 * Beschreiben Sie hier die Klasse Part1.
2. Create a new Java Class named Part1. The following methods go in this class.
3. Write the method findStopCodon that has three parameters, a String parameter named dna, an integer parameter named startIndex that represents where the first occurrence of ATG occurs in dna, and a String parameter named stopCodon. This method returns the index of the first occurrence of stopCodon that appears past startIndex and is a multiple of 3 away from startIndex. If there is no such stopCodon, this method returns the length of the dna strand.
4. Write the void method testFindStopCodon that calls the method findStopCodon with several examples and prints out the results to check if findStopCodon is working correctly. Think about what types of examples you should check. For example, you may want to check some strings of DNA that have genes and some that do not. What other examples should you check?
5. Write the method findGene that has one String parameter dna, representing a string of DNA. In this method you should do the following:
Find the index of the first occurrence of the start codon “ATG”. If there is no “ATG”, return the empty string.
Find the index of the first occurrence of the stop codon “TAA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Hint: call findStopCodon.
Find the index of the first occurrence of the stop codon “TAG” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Find the index of the first occurrence of the stop codon “TGA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. 
Return the gene formed from the “ATG” and the closest stop codon that is a multiple of three away. If there is no valid stop codon and therefore no gene, return the empty string.
6. Write the void method testFindGene that has no parameters. You should create five DNA strings. The strings should have specific test cases such as DNA with no “ATG”, DNA with “ATG” and one valid stop codon, DNA with “ATG” and multiple valid stop codons, DNA with “ATG” and no valid stop codons. Think carefully about what would be good examples to test. For each DNA string you should: 
Print the DNA string. 
Calculate the gene by sending this DNA string as an argument to findGene. If a gene exists following our algorithm above, then print the gene, otherwise print the empty string.
7. Write the void method printAllGenes that has one String parameter dna, representing a string of DNA. In this method you should repeatedly find genes and print each one until there are no more genes. Hint: remember you learned a while(true) loop and break.   
 */
public class Part1 {

    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currIndex = dna.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) {
                return currIndex;
            }
            currIndex = dna.indexOf(stopCodon, currIndex + 1);
        }
        return dna.length();
    }

    public void testFindStopCodon() {
        String dna = "ATGAAATAA";
        int startIndex = dna.indexOf("ATG");
        String stopCodon = "TAA";
        int stopIndex = findStopCodon(dna, startIndex, stopCodon);
        System.out.println("DNA: " + dna);
        System.out.println("Start index: " + startIndex);
        System.out.println("Stop codon: " + stopCodon);
        System.out.println("Stop index: " + stopIndex);
    }

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
        if (minIndex == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }

    public void testFindGene() {
        String[] dnas = {"ATGAAATAA", "ATGAAATAGTAA", "ATGAAATAGTAGTAA", "GATTACA", "AAATGCCCTAACTAGATTAAGAAACC"};
        for (String dna : dnas) {
            System.out.println("DNA: " + dna);
            System.out.println("Gene: " + findGene(dna));
        }
    }

    public void printAllGenes(String dna) {
        while (true) {
            String gene = findGene(dna);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            int startIndex = dna.indexOf(gene) + gene.length();
            dna = dna.substring(startIndex);
        }
    }
}


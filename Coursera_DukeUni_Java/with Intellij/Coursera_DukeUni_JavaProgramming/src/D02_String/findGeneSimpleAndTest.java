package D02_String;

public class findGeneSimpleAndTest {
    public String findGeneSimple(String dna) {
        //start codon is "ATG"
        //stop codon is "TAA"

        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) //no ATG
        {
            return"";
        }
        int stopIndex = dna.indexOf("TAA",startIndex+3);
        if (stopIndex == -1) //no TAA
        {
            return"";
        }
        result = dna.substring(startIndex, stopIndex+3);
        return result;
    }

    public void testfindGenesimple() {
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is: "+gene);

        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

        dna = "ATGTAA";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

        dna = "TTATAA";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

        dna = "CGATGGTTTAAAAGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

        dna = "CGATGGTTTGT";
        System.out.println("DNA strand is: " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is: " + gene);

    }
}
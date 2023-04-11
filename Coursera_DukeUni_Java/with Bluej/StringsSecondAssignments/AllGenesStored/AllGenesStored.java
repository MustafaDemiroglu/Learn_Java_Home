import edu.duke.*;
/**
 * Beschreiben Sie hier die Klasse AllGenesStored.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AllGenesStored {
    
    public int findStopCodon (String dnaStr, int startIndex, String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1) {
            int diff = currIndex - startIndex ;
            if (diff % 3 == 0) {
                return currIndex;
            }
            else{
                currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
            }
        }
        return -1 ;
    }
    
    public String findGene (String dna, int where) {
        int startIndex = dna.indexOf ("ATG", where);
        if (startIndex == -1) {
            return "" ;
        }
        int taaIndex = findStopCodon (dna, startIndex, "TAA");
        int tagIndex = findStopCodon (dna, startIndex, "TAG");
        int tgaIndex = findStopCodon (dna, startIndex, "TGA");
        int minIndex = 0;
        if (taaIndex == -1 || (tgaIndex !=-1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex ;
        }
        else {
            minIndex = taaIndex;
        }
        if (minIndex ==-1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex ; 
        }
        if (minIndex == -1) {
        return "" ;
        }
        
        return dna.substring (startIndex, minIndex+3);
    }
    
    public StorageResource getAllGenes (String dna) {
        // create an empty StorageResource, call it geneList
        StorageResource geneList = new StorageResource();
        // Set startindex to 0
        int startIndex = 0 ;
        // Repeat the following steps
        
       while (true) {
           // Find the next gene after startIndex
           String currentGene = findGene (dna, startIndex);
           // If no gene was found, leave this loop
           if (currentGene.isEmpty()) {
               break;
           }
           // Add that gene to geneList 
           geneList.add(currentGene);
           // Set startindex to just past the end of the gene
           startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length ();
       }
       // Your Anser ist geneList
       return geneList; 
    }
    
    public void testOn (String dna) {
        System.out.println ("Testing getAllGenes on " + dna);
        StorageResource genes = getAllGenes (dna) ;
        for (String g: genes.data()) {
            System.out.println(g);
        }
    }
    
    public void test() {
        //      ATGv  TAAv  ATG   v   v TGA 
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        //      ATGv   TAAv    TAAV   v    ATGTAA 
        testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    }

}

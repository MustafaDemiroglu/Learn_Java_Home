
/**
 * Using ANd && and OR ||
 * 
 * This is just a Projekt that ihave done during the learning with Duke.edu from Coursera 
 * @author Mustafa Demiroglu 
 * @version 11.04.2023
 */
public class AllCodonsAnd {
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
    
    public String findGene (String dna) {
        int startIndex = dna.indexOf ("ATG");
        if (startIndex == -1) {
            return "" ;
        }
        int taaIndex = findStopCodon (dna, startIndex, "TAA");
        int tagIndex = findStopCodon (dna, startIndex, "TAG");
        int tgaIndex = findStopCodon (dna, startIndex, "TGA");
        // (other version instead down written code)  int minIndex = Math.min (tgaIndex, Math.min (taaIndex, tagIndex));
        int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(temp, tgaIndex);
        // if taaIndex == -1 OR
        // if tgaIndex != -1 AND tgaIndex < taaIndex
        // (it was just for trxing) int minIndex = 0;
        if (taaIndex == -1 || (tgaIndex !=-1 && tgaIndex < taaIndex)) {
            // then set minIndex to tgaIndex
            minIndex = tgaIndex ;
        }
        // else set minIndex to taaIndex
        else {
            minIndex = taaIndex;
        }
        // if minIndex == -1 OR
        // if tagIndex != -1 and tagIndex < minIndex
        if (minIndex ==-1 || (tagIndex != -1 && tagIndex<minIndex)) {
            // then set minIndex to tagIndex
            minIndex = tagIndex ; 
        }
        // if minIndex == -1, return""
        if (minIndex == -1) {
        return "" ;
        }
        
        return dna.substring (startIndex, minIndex+3);
    }
    
    public void testFindStop () {
        //            01234567890123456789012345
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex = findStopCodon (dna, 0 , "TAA");
        if (dex != 9) System.out.println ("error on 9");
        dex = findStopCodon (dna,9,"TAA");
        if (dex != 21) System.out.println ("error on 21");
        dex = findStopCodon (dna,1,"TAA");
        if (dex != -1) System.out.println ("error on 26");
        dex = findStopCodon (dna,0,"TAG");
        if (dex != -1) System.out.println ("error on 26 TAG");
        System.out.println ("tests finished"); 
    }
    
    public void testFindGene () {
        String dna = "ATGCCCGGGAAATAACCC";
        String gene = findGene (dna) ;
        if (! gene.equals ("ATGCCCGGGAAATAA")) {
            System.out.println ("error");
        }
        System.out.println ("tests finished");
    }
}

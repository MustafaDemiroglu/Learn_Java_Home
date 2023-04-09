
/**
 * Beschreiben Sie hier die Klasse AllCodons.
 * 
 * @author (Mustafa Demiroglu) 
 * @version (09.04.2023)
 */
public class AllCodons {
    
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        //find stopCodon starting from (startIndex+3), currIndex
            int currIndex = dnaStr.indexOf(stopCodon, startIndex);
         //as long as currIndex is not equal to -1
            while (currIndex != -1) {
                int diff = currIndex - startIndex;
                //check if currIndex - startIndex is a multiple of 3
                if (diff % 3 == 0) {
                     //if so, currIndex is answer, return it
                    return currIndex;
                    //if not, update currIndex, looking for stopCodon again
                } else {
                    //  starting from currIndex + 1
                    currIndex = dnaStr.indexOf(stopCodon, currIndex+1);
                }
        //if we exit loop, we didn't find stopCodon
        //so return dnaStr.length()
        }
        return dnaStr.length();
    }
    
    public String findGene(String dna){
        //find first occurance of "ATG", startindex
        //if startIndex is -1, return""
        //use taaIndex to store findStopCodon(dna,startIndex,"TAA"
        //use tagIndex to store findStopCodon(dna,startIndex,"TAA"
        //use tgaIndex to store findStopCodon(dna,startIndex,"TAA"
        //store in minIndex the smallest of these three values
        //if minIndex is dna.length()? nothing found, return""
        //otherwise answer is text from startIndex to minIndex
        return"";
    }
    
    public void testFindStop () {
        //            01234567890123456789012345 
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex = findStopCodon (dna, 0, "TAA");
        if (dex != 9) System.out.println ("error on 9");
        dex = findStopCodon (dna, 9, "TAA");
        if (dex != 21) System.out.pritln ("error on 21");
        dex = findStopCodon (dna,1,"TAA");
        if (dex != 26) System.out.println ("error on 26");
        dex = findStopCodon (dna, 0, "TAG");
        if (dex != 26) System.out.println ("error on 26 TAG");
        System.out.println ("tests finished and no Fehler found");
    }
}

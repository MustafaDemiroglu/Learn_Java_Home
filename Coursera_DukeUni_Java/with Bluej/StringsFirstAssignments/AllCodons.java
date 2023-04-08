
/**
 * Beschreiben Sie hier die Klasse AllCodons.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AllCodons {
    
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        //find stopCodon stating from (startIndex+3), currIndex
            int currIndex = dna.indexOf(stopCodon, startIndex);
        //as long as currIndex is not equal to -1
            //check if currIndex - startIndex is a multiple of 3
            //if so, currIndex is answer, return it
            //if not, update currIndex, looking for stopCodon again
            //  starting from currIndex + 1
        //if we exit loop, we didn't find stopCodon
        //so return dnaStr.length()
        return 0;
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
}


/**
 * Klasse CSVMax.
 * to find the hottest Day in a Weather Databank 
 * @author Mustafa Demiroglu
 * @version 12.04.2023
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class CSVMax {
   
    public CSVRecord hottestHourInFile (CSVParser parser) {
        // start with largestSOFAR as nothing
        CSVRecord largestSoFar = null ;
        // For each row (currentRow) in the CSV File
        for (CSVRecord currentRow : parser){ 
            // If largestsoFar is nothing
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        // The largestSoFar is the answer
        return largestSoFar;
    }
    
    public void testHottestInDay () {
        FileResource fr = new FileResource ("data/2015/weather-2015-01-01.csv");
        CSVRecord largest = hottestHourInFile(fr.getCSVParser());
        System.out.println ("hottest temperature was " + largest.get("TemperatureF")+ " at " + largest.get("TimeEST"));
    }
    
    public CSVRecord hottestInManyDays() {
        CSVRecord largestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        // iterate over files
        for (File f:dr.selectedFiles()){
            FileResource fr = new FileResource (f);
            // use method to get largest in file
            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        // The largestSoFar is the answer
        return largestSoFar;
    }
    
    public void testHottestInManyDay () {
        CSVRecord largest = hottestInManyDays();
        System.out.println ("hottest temperature was " + largest.get("TemperatureF")+ " at " + largest.get("DateUTC"));
    }
    
    public CSVRecord getLargestOfTwo (CSVRecord currentRow, CSVRecord largestSoFar){
        // If largestsoFar is nothing
            if (largestSoFar == null) {
                largestSoFar = currentRow ;
            }
            // Otherwise
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
                // Check if currentRow's temperature > largestSoFar
                if (currentTemp > largestTemp) {
                    // If so update largestSoFar to currentRow
                    largestSoFar = currentRow;
                }
            }
        return largestSoFar;
    }
}

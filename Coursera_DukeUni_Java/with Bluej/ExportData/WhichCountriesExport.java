
/**
 * work with CSV 
 * 
 * @author Mustafa DEmiroglu 
 * @version 12.04.2023
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
    
    public void listExporters (CSVParser parser, String exportOfInterest) {
        // for each row in the CSV File
        for (CSVRecord record : parser){
            // Look at thw "Exports" column
            String export = record.get ("Exports");
            // Check if it contains exportOfInterst
            if (export.contains(exportOfInterest)) {    
                // If so, write down the "Country" from that row
                String country = record.get("Country");
                System.out.println (country);
            }
        }    
    }
    
    public void listExportersTwoProducts (CSVParser parser, String exportItem1, String exportItem2) {
        for (CSVRecord record : parser){
            String exports = record.get ("Exports");
            if (exports.contains(exportItem1) && exports.contains(exportItem2)) {    
                String country = record.get("Country");
                System.out.println (country);
            }
        }
    }
    
    public String countryInfo(CSVParser parser, String country) {
        for (CSVRecord record : parser) {
            String currentCountry = record.get("Country");
            if (currentCountry.equals(country)) {
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                return currentCountry + ": " + exports + ": " + value;
            }
        }
        return "NOT FOUND";
    }
    
    public int numberOfExporters(CSVParser parser, String exportItem) {
        int count = 0;
        for (CSVRecord record : parser) {
            String exports = record.get("Exports");
            if (exports.contains(exportItem)) {
                count++;
            }
        }
        return count;
    }
    
    public void bigExporters(CSVParser parser, String amount) {
        for (CSVRecord record : parser) {
            String value = record.get("Value (dollars)");
            if (value.length() > amount.length()) {
                String country = record.get("Country");
                System.out.println(country + " " + value);
            }
        }
    }
    
    public void whoExportsCoffe(){
        FileResource fr = new FileResource ();
        CSVParser parser = fr.getCSVParser();
        listExporters(parser, "coffee");
    }
    
    public void testCountryInfo2(){
        FileResource fr = new FileResource("exportdata.csv");
        CSVParser parser = fr.getCSVParser();
        String country = "Nauru";
        String info = countryInfo(parser, country);
        System.out.println(info);
    }
    
    public void testTwoProductExporters (){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExportersTwoProducts(parser, "gold", "diamonds");
    }
    
    public void testTwoProductExporters2 (){
        FileResource fr = new FileResource("exportdata.csv");
        CSVParser parser = fr.getCSVParser();
        listExportersTwoProducts(parser, "fish", "nuts");
    }
    
    public void testNumberOfExporters (){
        FileResource fr = new FileResource("exportdata.csv");
        CSVParser parser = fr.getCSVParser();
        int count = numberOfExporters(parser, "gold");
        System.out.println(count);
    }
    
    public void testBigExporters () {
        FileResource fr = new FileResource("exportdata.csv");
        CSVParser parser = fr.getCSVParser();
        bigExporters(parser, "$999,999,999,999");
    }
    
}
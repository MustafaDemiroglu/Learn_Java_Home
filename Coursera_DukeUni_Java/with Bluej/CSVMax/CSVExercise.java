
/**
 * This was an exercise for 
 * You will write a program to find the coldest day of the year and other interesting facts about the temperature and humidity 
 * in a day. To test your program, you will use the nc_weather data folder that has a folder for each year; you can download 
 * a .zip folder with these files by clicking here. In the year folder there is a CSV file for every day of the year; each file
 * has the following information. For example, in the 2014 folder, we show parts of the file weather-2014-01-08.csv, the weather 
 * data from January 8, 2014. 
 * @author Mustafa Demiroglu
 * @version 12.04.2023
 */

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class CSVExercise {

    public CSVRecord hottestHourInFile (CSVParser parser) {
        CSVRecord largestSoFar = null ;
        for (CSVRecord currentRow : parser){ 
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
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
        for (File f:dr.selectedFiles()){
            FileResource fr = new FileResource (f);
            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        return largestSoFar;
    }
    
    public void testHottestInManyDay () {
        CSVRecord largest = hottestInManyDays();
        System.out.println ("hottest temperature was " + largest.get("TemperatureF")+ " at " + largest.get("DateUTC"));
    }
    
    public CSVRecord getLargestOfTwo (CSVRecord currentRow, CSVRecord largestSoFar){
            if (largestSoFar == null) {
                largestSoFar = currentRow ;
            }
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
                if (currentTemp > largestTemp) {
                    largestSoFar = currentRow;
                }
            }
        return largestSoFar;
    }
    
    /*
     * it mkes an error. -9999 value schould be ignored
    public CSVRecord getSmallestOfTwo (CSVRecord currentRow, CSVRecord smallestSoFar){
            if (smallestSoFar == null) {
                smallestSoFar = currentRow ;
            }
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double smallestTemp = Double.parseDouble(smallestSoFar.get("TemperatureF"));
                if (currentTemp < smallestTemp) {
                    smallestSoFar = currentRow;
                }
            }
        return smallestSoFar;
    }
    */
   
    public CSVRecord getSmallestOfTwo(CSVRecord currentRow, CSVRecord smallestSoFar) {
    if (smallestSoFar == null) {
        smallestSoFar = currentRow;
    } else {
        double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
        double smallestTemp = Double.parseDouble(smallestSoFar.get("TemperatureF"));
        if (currentTemp < smallestTemp && currentTemp != -9999) {
            smallestSoFar = currentRow;
        }
    }
    return smallestSoFar;
    }
   
    public CSVRecord coldestHourInFile (CSVParser parser) {
        CSVRecord smallestSoFar = null ;
        for (CSVRecord currentRow : parser){ 
            smallestSoFar = getSmallestOfTwo(currentRow, smallestSoFar);
        }
        return smallestSoFar;
    }
    
    public void testColdestHourInFile () {
        FileResource fr = new FileResource ("data/2015/weather-2015-01-01.csv");
        CSVRecord smallest = coldestHourInFile(fr.getCSVParser());
        System.out.println ("coldest temperature was " + smallest.get("TemperatureF")+ " at " + smallest.get("TimeEST"));
    }
    
    
    public CSVRecord coldestInManyDays() {
        CSVRecord smallestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f:dr.selectedFiles()){
            FileResource fr = new FileResource (f);
            CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());
            smallestSoFar = getSmallestOfTwo(currentRow, smallestSoFar);
        }
        return smallestSoFar;
    }
    
    public void testColdestInManyDay () {
        CSVRecord smallest = coldestInManyDays();
        System.out.println ("coldest temperature was " + smallest.get("TemperatureF")+ " at " + smallest.get("DateUTC"));
    }
    
    public CSVRecord getSmallestHumidityOfTwo(CSVRecord currentRow, CSVRecord smallestSoFar) {
        if (smallestSoFar == null) {
            smallestSoFar = currentRow;
        } else {
            String currentHumidityStr = currentRow.get("Humidity");
            String smallestHumidityStr = smallestSoFar.get("Humidity");
    
            // Check if the humidity values are valid
            if (!currentHumidityStr.equals("") && !currentHumidityStr.equals("N/A") &&
                    !smallestHumidityStr.equals("") && !smallestHumidityStr.equals("N/A")) {
                try {
                    double currentHumidity = Double.parseDouble(currentHumidityStr);
                    double smallestHumidity = Double.parseDouble(smallestHumidityStr);
                    if (currentHumidity < smallestHumidity) {
                        smallestSoFar = currentRow;
                    }
                } catch (NumberFormatException e) {
                    // Handle invalid humidity value
                    System.out.println("Invalid humidity value: " + e.getMessage());
                }
            }
        }
        return smallestSoFar;
    }
    
    
    /*
     * i had error. i coudn't solve it
    public CSVRecord getSmallestHumidityOfTwo (CSVRecord currentRow, CSVRecord smallestSoFar){
            if (smallestSoFar == null) {
                smallestSoFar = currentRow ;
            }
            else {
                double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
                double smallestHumidity = Double.parseDouble(smallestSoFar.get("Humidity"));
                if (currentHumidity < smallestHumidity) {
                    smallestSoFar = currentRow;
                }
            }
        return smallestSoFar;
    }
    */
   
    public CSVRecord lowestHumidityInFile (CSVParser parser) {
        CSVRecord smallestSoFar = null;
        for (CSVRecord currentRow : parser){ 
            smallestSoFar = getSmallestHumidityOfTwo(currentRow, smallestSoFar);
        }
        return smallestSoFar;
    }
    
    public void testLowestHumidityInFile () {
        FileResource fr = new FileResource ("data/2014/weather-2014-04-01.csv");
        CSVRecord smallest = lowestHumidityInFile(fr.getCSVParser());
        System.out.println ("lowest humidity was " + smallest.get("Humidity")+ " at " + smallest.get("DateUTC"));
    }
    
    public CSVRecord lowestHumidityInManyDays() {
        CSVRecord smallestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f:dr.selectedFiles()){
            FileResource fr = new FileResource (f);
            CSVRecord currentRow = lowestHumidityInFile(fr.getCSVParser());
            smallestSoFar = getSmallestHumidityOfTwo(currentRow, smallestSoFar);
        }
        return smallestSoFar;
    }
    
    public void testLowestHumidityInManyDays () {
        CSVRecord smallest = lowestHumidityInManyDays();
        System.out.println ("lowest humidity was " + smallest.get("Humidity")+ " at " + smallest.get("DateUTC"));
    }
    
    
    public double averageTemperatureInFile(CSVParser parser) {
        double sum = 0;
        int count = 0;
        for (CSVRecord record : parser) {
            double temperature = Double.parseDouble(record.get("TemperatureF"));
            sum += temperature;
            count++;
        }
        return sum / count;
    }

    public void testAverageTemperatureInFile() {
        FileResource fr = new FileResource("weather/2013/weather-2013-08-10.csv");
        CSVParser parser = fr.getCSVParser();
        double avgTemp = averageTemperatureInFile(parser);
        System.out.println("Average temperature in file is " + avgTemp);
    }
    
    public double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value) {
        double sum = 0;
        int count = 0;
        for (CSVRecord record : parser) {
            int humidity = Integer.parseInt(record.get("Humidity"));
            if (humidity >= value) {
                double temperature = Double.parseDouble(record.get("TemperatureF"));
                sum += temperature;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No temperatures with that humidity");
            return 0.0;
        }
        return sum / count;
    }

    public void testAverageTemperatureWithHighHumidityInFile() {
        FileResource fr = new FileResource("data/2013/weather-2013-09-02.csv");
        CSVParser parser = fr.getCSVParser();
        int value = 80;
        double avgTemp = averageTemperatureWithHighHumidityInFile(parser, value);
        if (avgTemp != 0.0) {
            System.out.println("Average Temp when high Humidity is " + avgTemp);
        }
    }
}

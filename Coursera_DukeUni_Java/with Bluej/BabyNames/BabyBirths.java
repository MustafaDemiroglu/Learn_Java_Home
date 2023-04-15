
/**
 * Beschreiben Sie hier die Klasse BabyBirths.
 * Data overview
 * To find a Name which is same popular as a name in another year we select
 * @author Mustafa Demirogllu
 * @version 14.02.2023
 */

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.FileReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;

public class BabyBirths {
    
    public void printNames () {
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)){
            int numBorn = Integer.parseInt (rec.get(2));
            if (numBorn <= 100){
                System.out.println("Name " + rec.get(0) + " Gender " + rec.get(1) + " Num Born " + rec.get(2));
            }
        }
    }
    
    public void totalBirths (FileResource fr){
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            int numBorn = Integer.parseInt (rec.get(2));
            totalBirths += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
            }
            else {
                totalGirls += numBorn;
            }
        }
        System.out.println ("total Births = " + totalBirths);
        System.out.println ("total Births of Girls = " + totalGirls);
        System.out.println ("total Births of Boys = " + totalBoys);
    }
    
    public void testTotalBirths () {
        FileResource fr = new FileResource ("data/yob1905.csv");
        totalBirths(fr);
    }
    
    public int getRank(int year, String name, String gender) {
        FileResource fr = new FileResource("data/yob" + year + ".csv");
        int rank = 0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if (rec.get(1).equals(gender)){
                rank++;
                if (rec.get(0).equals(name)){
                    return rank;
                }
            }
        }
        return -1;
    } 
    
    public void testGetRank() {
        int rank1 = getRank(1974, "Owen", "M");
        System.out.println("Rank of Owen (M) in 1971: " + rank1);
        
        int rank2 = getRank(1974, "Owen", "F");   
        System.out.println("Rank of Frank (F) in 1971: " + rank2);
        
        //int rank1 = getRank(1971, "Frank", "M");
        //System.out.println("Rank of Frank (M) in 1971: " + rank1);
        
        //int rank2 = getRank(1971, "Frank", "F");   
        //System.out.println("Rank of Frank (F) in 1971: " + rank2);
  
    }
    
    public int samePopularNameRank(int year1, int year2, String name, String gender) {
        int rank1 = getRank(year1, name, gender);
        int rank2 = getRank(year2, name, gender);
        if (rank1 == -1 || rank2 == -1) {
            return -1;
        }
        if (rank1 == rank2) {
            return rank1;
        }
        int lowerRank = Math.min(rank1, rank2);
        int higherRank = Math.max(rank1, rank2);
        FileResource fr = new FileResource("data/yob" + year2 + ".csv");
        int currRank = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(1).equals(gender)) {
                currRank++;
                if (currRank == higherRank) {
                    return -1;
                }
                if (currRank == lowerRank && rec.get(0).equals(name)) {
                    return lowerRank;
                }
            }
        }
        return -1;
    }
    
    public void testSamePopularNameRank() {
        int rank1 = samePopularNameRank(2010, 2012, "M", "Mason");
        int rank2 = samePopularNameRank(2012, 2014, "F", "Sophia");
        int rank3 = samePopularNameRank(2010, 2014, "M", "Mason");
        System.out.println("Rank of Mason (M) in 2010 and 2012: " + rank1);
        System.out.println("Rank of Sophia (F) in 2012 and 2014: " + rank2);
        System.out.println("Rank of Mason (M) in 2010 and 2014: " + rank3);
    }
    
    public String getName(int year, int rank, String gender) {
        String fileName = "data/yob" + year + ".csv";
        FileResource fr = new FileResource(fileName);
        int currentRank = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(1).equals(gender)) {
                currentRank++;
                if (currentRank == rank) {
                    return rec.get(0);
                }
            }
        }
        return "NO NAME";
    }

    public void testGetName() {
        System.out.println("the boys name in 1982 of rank 450 is : " + getName(1982, 450, "M"));
        //System.out.println("the girls name in 1980 of rank 350 is : " + getName(1980, 350, "F"));
        //System.out.println(getName(2014, 1, "M")); // should print "Noah"
        //System.out.println(getName(2014, 2, "F")); // should print "Emma"
        //System.out.println(getName(2014, 100000, "M")); // should print "NO NAME"
    }
    
    public void whatIsNameInYear(String name, int year, int newYear, String gender) {
        // Get the rank of the name in the original year
        int rank = getRank(year, name, gender);
        // Get the name at the same rank in the new year
        String newName = getName(newYear, rank, gender);
        // Print the output
        System.out.println(name + " was born in " + year + " but he would be " + newName + " if he were born in " + newYear + ".");
    }
    
    public void testWhatIsNameInYear() {
        // whatIsNameInYear("Susan", 1972, 2014, "F");
        whatIsNameInYear("Owen", 1974, 2014, "M");
    }
    
    public int yearOfHighestRank(String name, String gender) {
        int highestRank = Integer.MAX_VALUE;
        int yearOfHighestRank = -1;
        
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);
            int currentYear = Integer.parseInt(f.getName().substring(3, 7));
            int currentRank = getRank(currentYear, name, gender);
            if (currentRank != -1 && currentRank < highestRank) {
                highestRank = currentRank;
                yearOfHighestRank = currentYear;
            }
        }
        
        return yearOfHighestRank;
    }
    
    public void testYearOfHighestRank() {
        //String name = "Genevieve";
        //String gender = "F";
        String name = "Mich";
        String gender = "M";
        int year = yearOfHighestRank(name, gender);
        System.out.println(name + " highest rank was in " + year);
    }
    
    public double getAverageRank(String name, String gender) {
        DirectoryResource dr = new DirectoryResource();
        double sumRank = 0.0;
        int count = 0;
        for (File f : dr.selectedFiles()) {
            int year = Integer.parseInt(f.getName().substring(3, 7));
            int rank = getRank(year, name, gender);
            if (rank != -1) {
                sumRank += rank;
                count++;
            }
        }
        if (count == 0) {
            return -1.0;
        }
        return sumRank / count;
    }
    
    public void testGetAverageRank() {
        double avgRank5 = getAverageRank("Susan", "F");
        System.out.println("Average rank of Susan (F) over selected files, all the data files in folder: " + avgRank5);
        
        double avgRank6 = getAverageRank("Robert", "M");
        System.out.println("Average rank of Robert (M) over selected files, all the data files in folder: " + avgRank6);
        
        //double avgRank1 = getAverageRank("Mason", "M");
        //System.out.println("Average rank of Mason (M) over selected files: " + avgRank1); // expected output: 3.0
    
        //double avgRank2 = getAverageRank("Jacob", "M");
        //System.out.println("Average rank of Jacob (M) over selected files: " + avgRank2); // expected output: 2.6666666666666665
    
        //double avgRank3 = getAverageRank("Sophia", "F");
        //System.out.println("Average rank of Sophia (F) over selected files: " + avgRank3); // expected output: 1.0
    
        //double avgRank4 = getAverageRank("Olivia", "F");
        //System.out.println("Average rank of Olivia (F) over selected files: " + avgRank4); // expected output: -1.0
    }
    
    public int getTotalBirthsRankedHigher(int year, String name, String gender) {
        int totalBirths = 0;
        String fileName = "data/yob" + year + ".csv";
        FileResource fr = new FileResource(fileName);
        CSVParser parser = fr.getCSVParser(false);
        boolean foundName = false;
    
        for (CSVRecord record : parser) {
            String currName = record.get(0);
            String currGender = record.get(1);
            int currBirths = Integer.parseInt(record.get(2));
    
            if (currGender.equals(gender)) {
                if (currName.equals(name)) {
                    foundName = true;
                    break;
                } else {
                    totalBirths += currBirths;
                }
            }
        }
    
        if (!foundName) {
            return -1;
        }
    
        return totalBirths;
    }
    
    public void testGetTotalBirthsRankedHigher() {
        int higherBirths = getTotalBirthsRankedHigher(1990, "Emily", "F");
        System.out.println("Total births ranked higher than Emily in 1990: " + higherBirths);
        
        higherBirths = getTotalBirthsRankedHigher(1990, "Drew", "M");
        System.out.println("Total births ranked higher than Drew in 1990: " + higherBirths);
    
        //higherBirths = getTotalBirthsRankedHigher(2013, "Emma", "F");
        //System.out.println("Total births ranked higher than Emma in 2013: " + higherBirths);

        //higherBirths = getTotalBirthsRankedHigher(2014, "Liam", "M");
        //System.out.println("Total births ranked higher than Liam in 2014: " + higherBirths);
  
        //higherBirths = getTotalBirthsRankedHigher(2015, "Sophia", "F");
        //System.out.println("Total births ranked higher than Sophia in 2015: " + higherBirths);
  
        //higherBirths = getTotalBirthsRankedHigher(2020, "Nonexistent", "M");
        //System.out.println("Total births ranked higher than Nonexistent in 2020: " + higherBirths);
        
    }
    
}

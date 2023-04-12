package D04_dnaAnalyser;

/*
 * Beschreiben Sie hier die Klasse GeneCounter2.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneCounter2 {
    public static void main(String[] args) throws IOException {
        String filename = "http://www.cs.duke.edu/~rodger/GRch38dnapart.fa";
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int count = 0;
        Pattern genePattern = Pattern.compile("^>.*gene=.*$"); // pattern to match gene header lines
        while ((line = reader.readLine()) != null) {
            Matcher matcher = genePattern.matcher(line);
            if (matcher.find()) { // if the line matches the gene pattern, count it as a gene
                count++;
            }
        }
        reader.close();
        System.out.println("Number of genes: " + count);
    }
}

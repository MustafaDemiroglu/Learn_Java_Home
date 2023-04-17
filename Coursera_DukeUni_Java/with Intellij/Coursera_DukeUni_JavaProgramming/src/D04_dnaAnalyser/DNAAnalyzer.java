package D04_dnaAnalyser;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class DNAAnalyzer {

    public static void main(String[] args) throws IOException {
        // Step 1: Read the DNA file into a single string
        String dnaFileUrl = "http://www.cs.duke.edu/~rodger/GRch38dnapart.fa";
        String dnaSequence = readDnaFile(dnaFileUrl);

        // Step 2: Extract the genes from the DNA sequence
        ArrayList<String> genes = extractGenes(dnaSequence);

        // Step 3: Count the number of genes
        int geneCount = genes.size();
        System.out.println("Gene count: " + geneCount);

        // Step 4: Count the number of genes with length > 60
        int geneLength60Count = 0;
        for (String gene : genes) {
            if (gene.length() > 60) {
                geneLength60Count++;
            }
        }
        System.out.println("Gene count with length > 60: " + geneLength60Count);

        // Step 5: Count the number of genes with CG ratio > 0.35
        int cgRatioCount = 0;
        for (String gene : genes) {
            double cgRatio = calculateCGRatio(gene);
            if (cgRatio > 0.35) {
                cgRatioCount++;
            }
        }
        System.out.println("Gene count with CG ratio > 0.35: " + cgRatioCount);

        // Step 6: Count the number of times the codon CTG appears
        int ctgCount = countCodon(dnaSequence, "CTG");
        System.out.println("Number of times CTG appears: " + ctgCount);

        // Step 7: Find the length of the longest gene
        int longestGeneLength = 0;
        for (String gene : genes) {
            if (gene.length() > longestGeneLength) {
                longestGeneLength = gene.length();
            }
        }
        System.out.println("Length of longest gene: " + longestGeneLength);
    }

    private static String readDnaFile(String url) throws IOException {
        StringBuilder dnaSequence = new StringBuilder();
        try (java.util.Scanner scanner = new java.util.Scanner(new URL(url).openStream(), "UTF-8")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.startsWith(">")) {
                    dnaSequence.append(line);
                }
            }
        }
        return dnaSequence.toString().toUpperCase();
    }

    private static ArrayList<String> extractGenes(String dnaSequence) {
        ArrayList<String> genes = new ArrayList<>();
        int startCodonIndex = dnaSequence.indexOf("ATG");
        while (startCodonIndex != -1) {
            int endCodonIndex = findEndCodonIndex(dnaSequence, startCodonIndex);
            if (endCodonIndex != -1) {
                String gene = dnaSequence.substring(startCodonIndex, endCodonIndex + 3);
                genes.add(gene);
                startCodonIndex = dnaSequence.indexOf("ATG", endCodonIndex);
            } else {
                startCodonIndex = dnaSequence.indexOf("ATG", startCodonIndex + 3);
            }
        }
        return genes;
    }

    private static int findEndCodonIndex(String dnaSequence, int startIndex) {
        for (int i = startIndex + 3; i < dnaSequence.length() - 2; i += 3) {
            String triplet = dnaSequence.substring(i, i + 3);
            if (triplet.equals("TAA") || triplet.equals("TAG") || triplet.equals("TGA")) {
                return i;
            }
        }
        return -1;
    }

    private static double calculateCGRatio(String dnaSequence) {
        int cCount = 0;
        int gCount = 0;
        for (int i = 0; i < dnaSequence.length(); i++) {
            char c = dnaSequence.charAt(i);
            if (c == 'C') {
                cCount++;
            } else if (c == 'G') {
                gCount++;
            }
        }
        int totalCgCount = cCount + gCount;
        double cgRatio = (double) totalCgCount / dnaSequence.length();
        return cgRatio;
    }

    private static int countCodon(String dnaSequence, String codon) {
        int count = 0;
        for (int i = 0; i < dnaSequence.length() - 2; i += 3) {
            String triplet = dnaSequence.substring(i, i + 3);
            if (triplet.equals(codon)) {
                count++;
            }
        }
        return count;
    }
}
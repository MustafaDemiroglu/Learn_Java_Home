import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeAnalyzer {

    public static void main(String[] args) {

        // Dosya adı değişkeni
        String filename = "shape.txt";

        // Dosyayı okuma ve koordinatları okuma
        ArrayList<Point> points = readPoints(filename);

        // Şeklin adını oluşturma
        String shapeName = "Shape-" + points.size();

        // Şeklin toplam çevresini hesaplama
        double perimeter = calculatePerimeter(points);

        // En uzun kenar uzunluğunu hesaplama
        double longestSide = findLongestSide(points);

        // Kenar uzunluklarının ortalamasını hesaplama
        double avgSideLength = calculateAverageSideLength(points);

        // Sonuçları yazdırma
        System.out.println("Shape Name: " + shapeName);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Longest Side: %.2f\n", longestSide);
        System.out.printf("Average Side Length: %.2f\n", avgSideLength);
    }

    // Dosyadan noktaları okur ve bir ArrayList olarak döndürür
    public static ArrayList<Point> readPoints(String filename) {
        ArrayList<Point> points = new ArrayList<Point>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                Point p = new Point(x, y);
                points.add(p);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return points;
    }

    // Noktaları birleştirerek şeklin toplam çevresini hesaplar
    public static double calculatePerimeter(ArrayList<Point> points) {
        double perimeter = 0.0;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % points.size());
            perimeter += p1.distance(p2);
        }
        return perimeter;
    }
}

// En uzun kenarın uz
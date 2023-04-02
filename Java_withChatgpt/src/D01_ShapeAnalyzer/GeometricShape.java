package D01_ShapeAnalyzer;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GeometricShape {

    private ArrayList<Point> points = new ArrayList<Point>();
    private String name;

    public GeometricShape(ArrayList<Point> points, String name) {
        this.points = points;
        this.name = name;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }
        perimeter += points.get(points.size() - 1).distance(points.get(0));
        return perimeter;
    }

    public double getLongestSide() {
        double longest = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double sideLength = points.get(i).distance(points.get(i + 1));
            if (sideLength > longest) {
                longest = sideLength;
            }
        }
        double lastSideLength = points.get(points.size() - 1).distance(points.get(0));
        if (lastSideLength > longest) {
            longest = lastSideLength;
        }
        return longest;
    }

    public double getAverageSideLength() {
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distance(points.get(i + 1));
        }
        totalLength += points.get(points.size() - 1).distance(points.get(0));
        return totalLength / points.size();
    }

    public String toString() {
        return "Geometric shape " + name;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file path of the geometric shape: ");
        String filePath = input.nextLine();
        ArrayList<Point> points = new ArrayList<Point>();
        try {
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] coords = line.split(",");
                double x = Double.parseDouble(coords[0].trim());
                double y = Double.parseDouble(coords[1].trim());
                Point point = new Point(x, y);
                points.add(point);
            }
            fileReader.close();
            GeometricShape shape = new GeometricShape(points, filePath);
            System.out.println(shape.toString());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Longest side: " + shape.getLongestSide());
            System.out.println("Average side length: " + shape.getAverageSideLength());
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
            e.printStackTrace();
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShape {
    private String name;
    private ArrayList<Point> points;

    public GeometricShape(String name, ArrayList<Point> points) {
        this.name = name;
        this.points = points;
    }

    public double getPerimeter() {
        double perimeter = 0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            double distance = current.distanceTo(next);
            if (distance > longestSide) {
                longestSide = distance;
            }
        }

        return longestSide;
    }

    public double getAverageSideLength() {
        double totalLength = 0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);
            totalLength += current.distanceTo(next);
        }

        return totalLength / n;
    }

    public String toString() {
        return "Geometric shape " + name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the points: ");
        String fileName = scanner.nextLine();

        ArrayList<Point> points = new ArrayList<Point>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split(",");
                double x = Double.parseDouble(tokens[0]);
                double y = Double.parseDouble(tokens[1]);
                Point point = new Point(x, y);
                points.add(point);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        GeometricShape shape = new GeometricShape(fileName, points);
        System.out.println(shape);
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Longest side: " + shape.getLongestSide());
        System.out.println("Average side length: " + shape.getAverageSideLength());
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
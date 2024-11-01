import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        return s.getPoints().size();
    }

    public double getAverageLength(Shape s) {
        double largestSide = 0.0;
        Point prevPt = s.getLastPoint();
    for (Point currPt : s.getPoints()) {
        double currDist = prevPt.distance(currPt);
        if (currDist > largestSide) {
            largestSide = currDist;
        }
        prevPt = currPt;
    }
    return largestSide;
    }

    public double getLargestSide(Shape s) {
    double largestSide = 0.0;
    Point prevPt = s.getLastPoint();
    for (Point currPt : s.getPoints()) {
        double currDist = prevPt.distance(currPt);
        if (currDist > largestSide) {
            largestSide = currDist;
        }
        prevPt = currPt;
    }
    return largestSide;
    }

    public double getLargestX(Shape s) {
    double largestX = Double.NEGATIVE_INFINITY;
    for (Point p : s.getPoints()) {
        double x = p.getX();
        if (x > largestX) {
            largestX = x;
        }
    }
    return largestX;
}

    public double getLargestPerimeterMultipleFiles() {
    DirectoryResource dr = new DirectoryResource();
    double largestPerimeter = 0.0;
    for (File f : dr.selectedFiles()) {
        FileResource fr = new FileResource(f);
        Shape s = new Shape(fr);
        double perimeter = getPerimeter(s);
        if (perimeter > largestPerimeter) {
            largestPerimeter = perimeter;
        }
    }
    return largestPerimeter;
}

    public String getFileWithLargestPerimeter() {
    DirectoryResource dr = new DirectoryResource();
    File temp = null;
    double largestPerimeter = 0.0;
    for (File f : dr.selectedFiles()) {
        FileResource fr = new FileResource(f);
        Shape s = new Shape(fr);
        double perimeter = getPerimeter(s);
        if (perimeter > largestPerimeter) {
            largestPerimeter = perimeter;
            temp = f;
        }
    }
    return temp.getName();
}

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }
    
    public void testPerimeterMultipleFiles() {
    double largestPerimeter = getLargestPerimeterMultipleFiles();
    System.out.println("largest perimeter = " + largestPerimeter);
}

    public void testFileWithLargestPerimeter() {
    String fileName = getFileWithLargestPerimeter();
    System.out.println("file with largest perimeter = " + fileName);
}

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}

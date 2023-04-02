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
        // Put code here
        return s.getPoints().size();
    }

    public double getAverageLength(Shape s) {
        // Find perimeter of the shape
        double perimeter = getPerimeter(s);
        // Find number of sides
        int numSides = getNumPoints(s);
        // Calculate average length
        double averageLength = perimeter/numSides;
        // Return average length
        return averageLength;
    }

    public double getLargestSide(Shape s) {
        double largestSide = 0.0;
        // Start with prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Check if current distance is larger than previous largest side
            if (currDist > largestSide) {
                largestSide = currDist;
            }
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // largestSide is the answer
        return largestSide;
    }

    public double getLargestX(Shape s) {
        double largestX = 0.0;
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Get x-coordinate of currPt
            double currX = currPt.getX();
            // Check if current x-coordinate is larger than previous largest x-coordinate
            if (currX > largestX) {
                largestX = currX;
            }
        }
        // largestX is the answer
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        // For each file f in the directory,
        for (File f : dr.selectedFiles()) {
            // Create a new Shape from the file
            Shape s = new Shape(new FileResource(f));
            // Get the perimeter of the Shape
            double currPerim = getPerimeter(s);
            // Check if current perimeter is larger than previous largest perimeter
            if (currPerim > largestPerim) {
                largestPerim = currPerim;
            }
        }
        // largestPerim is the answer
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        File temp = null;
        double largestPerim = 0.0;
        // For each file f in the directory,
        for (File f : dr.selectedFiles()) {
            // Create a new Shape from the file
            Shape s = new Shape(new FileResource(f));
            // Get the perimeter of the Shape
            double currPerim = getPerimeter(s);
            // Check if current perimeter is larger than previous largest perimeter
            if (currPerim > largestPerim) {
                largestPerim = currPerim;
                temp = f;
            }
        }
        // temp is the answer
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public void testPerimeterMultipleFiles() {
        double largestPerim = getLargestPerimeterMultipleFiles();
        System.out.println("largest perimeter in multiple files = " + largestPerim);
    }

    public void testFileWithLargestPerimeter() {
        String fileWithLargestPerim = getFileWithLargestPerimeter();
        System.out.println("file with largest perimeter = " + fileWithLargestPerim);
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
        double avgLen = getAverageLength(triangle);
        System.out.println("average length = " + avgLen);
        double largestSide = getLargestSide(triangle);
        System.out.println("largest side = " + largestSide);
        double largestX = getLargestX(triangle);
        System.out.println("largest X = " + largestX);
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
        pr.triangle();
    }
    
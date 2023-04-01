import edu.duke.*;

public class fordergroundImage {
    public static void main(String[] args) {
        var fgImage = new SimpleImage("drewRobert.png");
        var bgImage = new SimpleImage("dinos.png");
        var output = new SimpleImage(fgImage.getWidth(), fgImage.getHeight());
        var pixels = fgImage.getPixels(); // Get an array of all the pixels in fgImage
        for (var pixel : pixels) { // Loop through each pixel in the array
            var x = pixel.getX(); // Declare x and get the x-coordinate of the pixel
            var y = pixel.getY(); // Declare y and get the y-coordinate of the pixel
            var r = pixel.getRed(); // Declare r and get the red component of the pixel
            var g = pixel.getGreen(); // Declare g and get the green component of the pixel
            var b = pixel.getBlue(); // Declare b and get the blue component of the pixel
            if (g > r+b) {
                var pixel2 = bgImage.getPixel(x, y); // Get the pixel at the same location in bgImage
                output.setPixelAt(x, y, pixel2); // Set the output pixel to pixel2
            } else {
                output.setPixelAt(x, y, pixel); // Set the output pixel to the original pixel
            }
        }
        output.show(); // Show the output image
    }
}


/**
 * Beschreiben Sie hier die Klasse GrayScaleConverter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
    // i started with the image i wanted (inImage)
    public ImageResource makeGray(ImageResource inImage) {
        // I made a blank image of the ssame size
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        // for each pixel in outimage
        for (Pixel pixel: outImage.pixels()){
            // look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            // compute inPixel's red+ inPixels's blue + inPixels's green
            // divide that sum by 3 (call it average)
            int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen()) /3;
            // set pixels's red to average
            pixel.setRed(average);
            // set pixel's green to average
            pixel.setGreen(average);
            // set pixel's blue to average
            pixel.setBlue(average);
        }    
        return outImage;
    }
    
    public void testMakeGray(){
        ImageResource ir = new ImageResource();
        ImageResource gray = makeGray(ir);
        gray.draw();
    }
    
    public void selectAndConvert(){
        DirectoryResource dr =new DirectoryResource();
        for (File f: dr.selectedFiles()){
            ImageResource inImage = new ImageResource(f);
            ImageResource gray = makeGray(inImage);
            gray.draw();
        }
    }
}

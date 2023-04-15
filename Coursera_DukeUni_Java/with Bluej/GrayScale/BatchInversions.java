
/**
 * Beschreiben Sie hier die Klasse BatchInversions.
 * Assignment 2: Image Inversion
 * Write a program to create new images that are photographic negatives (or inverted images) of selected images and save these 
 * new images with filenames that are related to the original images, such as adding “inverted-” in front of the old filename. 
 * In inverting an image, a pixel’s red, blue, and green components are modified to be the exact opposite within the 0 to 255 
 * range. That is, if a pixel’s red, blue, and green values are (34, 198, 240), then that same pixel in the inverted image would
 * have the red, blue and green values of (221, 57, 15). Note that 255 - 34 is 221, 255 - 198 is 57, and 255 - 240 is 15.
 * 
 * To tackle this problem:
 * First think about how to create a new image that is the inverse of another image.
 * Start by solving an example by hand, write down the steps, find patterns and then test the algorithm
 * Then create a new BlueJ class called BatchInversions. In this class create a method named makeInversion that has one 
 * parameter, an image, and returns a new image that is the inverse of the original image.
 * Then add another method called selectAndConvert to handle the batch processing of files. This method allows the user to 
 * select several files and display the images. Test this method to make sure it works. Then modify the selectAndConvert method 
 * to save each inverted image as a file with a new filename. Use the old filename and append to the front of it “inverted-”
 * @author Mustafa Demiroglu
 * @version 15.04.2023
 */

import edu.duke.*;
import java.io.*;

public class BatchInversions {
    
    public ImageResource makeInversion(ImageResource inImage) {
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        for (Pixel pixel: outImage.pixels()){
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            int newRed = 255 - inPixel.getRed() ;
            int newBlue = 255 - inPixel.getBlue() ;  
            int newGreen = 255 - inPixel.getGreen() ;
            pixel.setRed(newRed);
            pixel.setGreen(newGreen);
            pixel.setBlue(newBlue);
        }    
        return outImage;
    }
    
    public void selectConvertAndSave(){
        DirectoryResource dr = new DirectoryResource();
        for (File f:dr.selectedFiles()){
        ImageResource image = new ImageResource (f);
        ImageResource invert = makeInversion(image);
        String fname = image.getFileName();
        String newName = "inverted-" + fname;
        invert.setFileName(newName);
        invert.save();
        invert.draw();
        }
    }  

}

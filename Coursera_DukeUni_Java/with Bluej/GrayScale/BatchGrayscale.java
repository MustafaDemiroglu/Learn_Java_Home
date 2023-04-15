
/**
 * Project von Coursera Duke Uni
 * Assignment 1: Batch Grayscale
 * You have learned how to convert an image to grayscale, and how to select and process several images to convert them to grayscale 
 * and display them. You also learned how to copy an image and save it with a different filename. Now put this all together in one 
 * program that batch processes several images, and creates and saves new images (with new filenames) that are grayscale versions 
 * of each image.
 * More specifically,
 * Your program should let the user select multiple image files
 * For each image, create a new image that is a grayscale version of the original image
 * For each image, save the grayscale image in a new file with the same filename as the original image, but with the word “gray-”
 * in front of the filename. For example, if the original file was named lion.png, the new image would be a grayscale image and
 * be named gray-lion.png.
 * Hint: Start with the Batch Grayscale program that processes many images, and add in code to save those files with new names.
 * @author Mustafa Demiroglu
 * @version 15.04.2023
 */

import edu.duke.*;
import java.io.*;

public class BatchGrayscale {
    
    public ImageResource makeGray(ImageResource inImage) {
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        for (Pixel pixel: outImage.pixels()){
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
            pixel.setRed(average);
            pixel.setGreen(average);
            pixel.setBlue(average);
        }    
        return outImage;
    }
    
    public void selectConvertAndSave(){
        DirectoryResource dr = new DirectoryResource();
        for (File f:dr.selectedFiles()){
        ImageResource image = new ImageResource (f);
        ImageResource gray = makeGray(image);
        String fname = image.getFileName();
        String newName = "gray-" + fname;
        gray.setFileName(newName);
        gray.draw();
        gray.save();
        }
    }  
}

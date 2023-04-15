
/**
 *  To save a file in a folder
 * 
 * @author Mustafa Demiroglu
 * @version 15.04.2023
 */

import edu.duke.*;
import java.io.*;

public class ImageSaver {
  
    public void doSave(){
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            ImageResource image = new ImageResource (f);
            String fname = image.getFileName();
            String newName = "copy-"+fname;
            image.setFileName(newName);
            image.draw();
            image.save();
        }
    }

}

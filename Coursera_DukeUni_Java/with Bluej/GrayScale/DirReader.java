
/**
 * Beschreiben Sie hier die Klasse DirReader.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import edu.duke.*;
import java.io.*;

public class DirReader {
    public void checkDir() {
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()) {
            System.out.println(f);
        }
    }
}

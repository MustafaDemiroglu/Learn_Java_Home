
/**
 * Beschreiben Sie hier die Klasse Something.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Something {   
  
  public void run() {
    FileResource f = new FileResource("words.txt");
    for (String g : f.lines()) {
      System.out.println(g);
      System.out.println(g);
    }
  }
}

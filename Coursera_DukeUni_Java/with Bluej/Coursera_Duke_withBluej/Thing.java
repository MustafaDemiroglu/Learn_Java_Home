
/**
 * Beschreiben Sie hier die Klasse Thing.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Thing {
  
  private int a;
  
  public Thing(int x) {
    a = x;
  }
  
  public int geta() {
    return a;
  }
  
  public void print() {
    int b = 4;
    System.out.println(geta() + " " + b);
  }
}

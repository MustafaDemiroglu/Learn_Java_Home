package D01_Modul_1_Quiz;
import edu.duke.*;
public class Something {

    public static void run() {
        FileResource f = new FileResource("words.txt");
        for (String g : f.lines()) {
            System.out.println(g);
            System.out.println(g);
        }
    }
    public void main(String[] args) {
        run();
    }
}
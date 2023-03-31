package D01_Modul_1_Quiz;

public class Something {
public class Something {

    public void run() {
        FileResource f = new FileResource("words.txt");
        for (String g : f.lines()) {
            System.out.println(g);
            System.out.println(g);
        }
    }
}
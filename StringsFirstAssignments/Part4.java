import edu.duke.*;

public class Part4 {
    public void findYoutube() {
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String word : ur.words()) {
            String lowerCaseWord = word.toLowerCase();
            int index = lowerCaseWord.indexOf("youtube.com");
            if (index != -1) {
                int startIndex = word.lastIndexOf("\"", index);
                int endIndex = word.indexOf("\"", index + 1);
                System.out.println(word.substring(startIndex + 1, endIndex));
            }
        }
    }

    public static void main(String[] args) {
        Part4 part4 = new Part4();
        part4.findYoutube();
    }
}
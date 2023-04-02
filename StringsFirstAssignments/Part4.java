import edu.duke.*;

public class Part4 {
    public static void main(String[] args) {
        // create a URLResource object
        URLResource resource = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        // search for youtube.com in each word and print the URLs
        for (String word : resource.words()) {
            String lowerCaseWord = word.toLowerCase();
            int youtubeIndex = lowerCaseWord.indexOf("youtube.com");
            if (youtubeIndex != -1) {
                int startIndex = word.lastIndexOf("\"", youtubeIndex);
                int endIndex = word.indexOf("\"", youtubeIndex + 1);
                System.out.println(word.substring(startIndex + 1, endIndex));
            }
        }
    }
}
//This code uses the URLResource class from the edu.duke package to read the file at http://www.dukelearntoprogram.com/course2/data/manylinks.html word by word. For each word, it converts the word to lowercase and checks if youtube.com is in the word using the indexOf() method. If youtube.com is found, it searches backward from the index of youtube.com to find the opening double quote and forward from the index of youtube.com to find the closing double quote. It then prints out the substring between the opening and closing double quotes, which should be the YouTube URL. Note that the indices used with the substring() method are adjusted by 1 to exclude the double quotes themselves.

//As mentioned in the instructions, the URLs are case-sensitive, so the lowercase word is used to find the index of youtube.com, but the original word is used to extract the YouTube URL.






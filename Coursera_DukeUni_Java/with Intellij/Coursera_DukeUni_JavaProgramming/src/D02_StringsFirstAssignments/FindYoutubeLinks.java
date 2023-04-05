package D02_StringsFirstAssignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindYoutubeLinks {
    public static void main(String[] args) {
        try {
            // create URL object
            URL url = new URL("http://www.dukelearntoprogram.com/course2/data/manylinks.html");

            // read the HTML content
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line);
            }
            in.close();

            // find links to youtube.com using regular expression
            String patternString = "href=[\"'](http[^\"']+\\byoutube\\.com[^\"']*)";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(content.toString());

            // print the links
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/**
 * 
 * 
 * @author Mustafa Demiroglu
 * @version 11.04.2023
 * Beschreiben Sie hier die Klasse Part2.
 * Part 2: HowMany - Finding Multiple Occurrences
 * This assignment will write a method to determine how many occurrences of a string appear in another string.
 * Specifically, you should do the following:
 * 1. Create a new Java Class named Part2in the StringsSecondAssignments project.
 * 2. Write the method named howMany that has two String parameters named stringa and stringb. This method returns an integer 
 * indicating how many times stringa appears in stringb, where each occurrence of stringa must not overlap with another 
 * occurrence of it. For example, the call howMany(“GAA”, “ATGAACGAATTGAATC”) returns 3 as GAA occurs 3 times. 
 * The call howMany(“AA”, “ATAAAA”) returns 2. Note that the AA’s found cannot overlap.
 * 3.Write the void method testHowMany has no parameters. Add code in here to call howMany with several examples and print the 
 * results. Think carefully about what types of examples would be good to test to make sure your method works correctly. 
 */
public class Part2 {
    
    public int howMany(String stringa, String stringb) {
        int count = 0;
        int startIndex = 0;
        while (true) {
            int index = stringb.indexOf(stringa, startIndex);
            if (index == -1) {
                break;
            }
            count++;
            startIndex = index + stringa.length();
        }
        return count;
    }
    
    public void testHowMany() {
        String stringa1 = "GAA";
        String stringb1 = "ATGAACGAATTGAATC";
        int result1 = howMany(stringa1, stringb1);
        System.out.println(stringa1 + " appears " + result1 + " times in " + stringb1);
        
        String stringa2 = "AA";
        String stringb2 = "ATAAAA";
        int result2 = howMany(stringa2, stringb2);
        System.out.println(stringa2 + " appears " + result2 + " times in " + stringb2);
        
        // Add more test cases here
    }
    
}
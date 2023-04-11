
/**
 * Beschreiben Sie hier die Klasse findAbc2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class findAbc2 {
    public void findAbc(String input){
       int index = input.indexOf("abc");
       while (true){
           if (index == -1 || index >= input.length() - 3){
               break;
           }
           System.out.println("index " + index);
           String found = input.substring(index+1, index+4);
           System.out.println(found);
           index = input.indexOf("abc",index+4);
           System.out.println("index after updating " + index);
           
       }
   }

   public void test(){
       //findAbc("abcd");
       //findAbc("abcdabc");
       findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
       findAbc("kdabcabcjei");
       findAbc("ttabcesoeiabco");
       findAbc("abcbabccabcd");
       findAbc("qwertyabcuioabcp");
       findAbc("abcabcabcabca");
   }

}

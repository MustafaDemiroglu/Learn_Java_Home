package day10_stringManipulation;

public class C03_startsWith {

    public static void main(String[] args) {

        String str = "Java harika";

        System.out.println(str.startsWith("java"));     // false
        System.out.println(str.startsWith("Ja"));       // true
        System.out.println(str.startsWith(str));        // true
        System.out.println(str.startsWith(""));         // true
    }
}

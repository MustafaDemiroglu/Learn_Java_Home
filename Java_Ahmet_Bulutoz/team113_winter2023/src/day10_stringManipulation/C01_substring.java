package day10_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java ne kadar güzel";

        System.out.println(str.substring(8));       // kadar güzel

        // System.out.println(str.substring(0));       // Java ne kadar güzel

        System.out.println(str);

        System.out.println(str.substring(str.length()-3));      // zel

        System.out.println(str.substring(str.length()));        // hiclik

    }
}

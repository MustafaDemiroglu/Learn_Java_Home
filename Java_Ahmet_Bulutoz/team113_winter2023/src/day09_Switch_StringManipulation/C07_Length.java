package day09_Switch_StringManipulation;

public class C07_Length {

    public static void main(String[] args) {

        String str = "Java gün gectikce güzellesiyor";

        // Bu cümledeki karakter sayisini yazdirin

        System.out.println(str.length());       // 30

        // Bu cümledeki son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));     // r

        // Sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));     // y

    }
}

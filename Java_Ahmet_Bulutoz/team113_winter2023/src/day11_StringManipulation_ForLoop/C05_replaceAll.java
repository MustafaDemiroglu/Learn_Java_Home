package day11_StringManipulation_ForLoop;

public class C05_replaceAll {

    public static void main(String[] args) {

        String str = "          J&ava54 C+an01dir,.....:             ";
        System.out.println(str);

        str = str.trim();
        System.out.println("trimden sonra str : " + str);

        // str'i Java Candir haline getirin

        str = str.replaceAll("\\d","");
        System.out.println("str yeni hali : " + str);

        str = str.replaceAll(" ","5");
        str = str.replaceAll("\\W", "");
        str = str.replaceAll("5", " ");
        System.out.println("str nin son hali : " + str);
    }
}

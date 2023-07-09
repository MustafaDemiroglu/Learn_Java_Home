package day09_switch_StringManipulation;

public class C05_concat {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";
        String str3 = " ";

        // yukaridaki variable leri kullanarak "Java Candir" yazdirin

        System.out.println(str1+str3+str2);

        System.out.println("--------------- Concat ---------------");
        System.out.println(str1.concat(str3).concat(str2));
    }
}

package day11_stringManipulation_ForLoop;

public class C06_replace {


    public static void main(String[] args) {

        /*
         * Soru 2 - kullanicidan belirli bir formatta verdigi Stringleri fyiatlari toplayip yazdirin
         * input 1 : "15.30 $";, input2 : "11.40 $"
         * output : 26.70 $
         *
         */

        String input1 = "15.30 $";
        String input2 = "11.40 $";

        // inputlard digit olmayan hersei yok edelim

        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");

        // digit olmayanlari yok ettik ama String olduklari icin toplayamayiz
        // int a parse etmeliiz

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        System.out.println((inp1+inp2)/100 + " $");
    }
}

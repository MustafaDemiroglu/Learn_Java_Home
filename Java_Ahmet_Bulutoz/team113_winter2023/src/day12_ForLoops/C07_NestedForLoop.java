package day12_ForLoops;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        // verilen bir rakam icin carpim tablosu olusturun

        int sayi = 4;

        /*
         *   1 2 3 4
         *   2 4 6 8
         *   3 6 9 12
         *   4 8 12 16
         */
        System.out.println("-------------benim cözümüm-----------");
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.println(i*j);
            }
        }

        System.out.println("------------hacanin cözümü---------------");
        for (int m = 1; m <=sayi ; m++) {
            for (int n = 1; n <=sayi ; n++) {
                System.out.print(m*n + "   ");
            }
            System.out.println("");
        }

    }
}

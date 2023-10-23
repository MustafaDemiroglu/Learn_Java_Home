package day15_DoWhileLoop_Scope;

public class C05_LocalVariable {
    public static void main(String[] args) {
        /*
         * 1 - bir method icerisinde olusturulan variablein scope u o method tur.
         *     baska bir method dan kullanilamaz
         *     bu variable lara local variable denir
         *
         * 2 - Her ne kadar bir method icerisinde olsalar da
         *     Loop larin da ayri bir scope vardir
         *     Loop icerisinde olusturulan variable dir.
         *     Loop dizisi disinda kullanilamazlar
         *
         * 3 - Local variable lari deger atamadan olusturabiliriz
         *     ancak deger atamadan kullanamayiz
         */

        String isim = "Ali Can";
        int sayi;

        // sayi ++;

        for (int i = 0; i < 10; i++) {
            int j = i+1;
        }

        // System.out.println(i);
    }

    public static void baskaMethod(){
        // System.out.println(isim);
        int sayi = 5;
    }

}

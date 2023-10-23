package day15_DoWhileLoop_Scope;

public class C06_ClassLevelVariable {

    /*
     * Bir class icinde tüm methodlarin erisebilecegi variable lar istenirse
     * Class Level da (Class in icinde ama methodlarin disinda) olusturulmalidir.
     *
     *  1- Class Level da olusturulan variable larin scope u tüm class dir.
     *  2- Class Level da olusturulan variable lara deger atanmasa bile
     *     Java onlar icin tanimlanmis DEFAULT DEGERLER atar
     *  3- Class Level da olusturulan variable lar static veya instance (static olmayan) olabilir
     *  4- static olarak tanimlanan variable lar tüm method lara direk olarak kullanilabilir
     *  5- method static ise icerisine static olmayan variable almaz
     */

    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String : " + isim); // null
        System.out.println("boolean : " + bl);  // false
        System.out.println("char : " + chr);    // '' hiclik
        System.out.println("int : " + in1);     // sayisal türler icin 0
        staticMethod();
        // staticOlmayanMethod();
    }

    public static void staticMethod() {
        sayi++;
        // in2++;
        // System.out.println(bl2);
    }

    public void staticOlmayanMethod() {
        sayi--;
        System.out.println(sayi);
        in2--;

    }



}

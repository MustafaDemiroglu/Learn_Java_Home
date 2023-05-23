package day05_incrementDecrement_Concatenation;

public class C01_IncrementDecrement {

    public static void main(String[] args) {

        int a = 20 ;

        // a degeroni 3 artttirin ve yeni degerini olusturacagniz b variablina atayin

        // a = a+3;

        // a = +3;
        // System.out.println(a); // 3

        a += 3;
        System.out.println(a);  // 23
        int b = a ;
        System.out.println(b);  //23
        System.out.println("a : " + a + " b : " + b );
        System.out.println(" ");

        // a nin degerini b ye atayin sonra a nin degerinin 3 artirin
        b = a ;
        a +=3 ;

        System.out.println("a : " + a + " b : " + b );
        System.out.println(" ");
        a = 20 ;

        // a nin degerini yazdirin ve sonra a yi 5 arttirin
        System.out.println("a : " + a);
        a+=5;
        System.out.println("a : " + a);
        System.out.println(" ");
        a=20;

        // a nin degerini 2 azaltin ve sonra a nin degerini yazdirin
        a-=2;
        System.out.println("a : " + a);

    }
}

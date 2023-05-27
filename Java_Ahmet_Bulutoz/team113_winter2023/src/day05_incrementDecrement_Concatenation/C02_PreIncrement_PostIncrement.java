package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // a nin degerini 1 arttirin ve yeni degerini olusturacagniz b variable ina atayin

        int a = 20 ;
        int b= ++a;     // önce arttirir sonrab atama yapar
        System.out.println("a: " + a + " b: " + b);

        /*
        a++;
        int b=a;
        System.out.println("a: " + a + " b: " + b);
         */

        // a nin degerini b ye atayin sonra a nin dgerini 1 arttirin

        a = 20 ;
        b=a++;      // önce atama yapar sonra arttirir
        System.out.println("a: " + a + " b: " + b);

        /*
        b=a;
        a++;
        System.out.println("a: " + a + " b: " + b);
         */



    }
}

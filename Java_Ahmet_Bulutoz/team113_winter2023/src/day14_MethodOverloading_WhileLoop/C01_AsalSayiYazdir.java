package day14_MethodOverloading_WhileLoop;

public class C01_AsalSayiYazdir {
    public static void main(String[] args) {
        // verilen 1 den büyük pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun
        asalMiYazdir(20);
        asalMiYazdir(35);
        asalMiYazdir(23);
    }

    public static void asalMiYazdir(int sayi) {
        int flag = 0 ;
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i == 0) {
                flag ++;
                break;
            }
        }

        if (sayi == 2) {
            System.out.println("Girilen 2 sayisi ASAL bir sayidir");
        } else if (flag == 0) {
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayidir");
        } else {
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayi degildir");
        }


    }
}

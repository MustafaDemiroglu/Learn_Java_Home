package day14_MethodOverloading_WhileLoop;

public class C02_IsAsal {
    public static void main(String[] args) {
        // Vrilen 1'den büyük bir tamsayi icin
        // Sayi asal ise true
        // Sayi asal degil ise false dönen bir method olusturun

        System.out.println(isAsal(20));     // false
        System.out.println(isAsal(23));     // true
        System.out.println(isAsal(27));     // false

        boolean sonuc = isAsal(57);     // sonuc variable na false deger i atar

    }

    public static boolean isAsal(int sayi){
        int flag = 0 ;

        for (int i = 2; i < sayi; i++) {
            if (sayi%i == 0) {
                flag++;
                break;
            }
        }
        if (sayi == 2) {
            return true;
        } else if (flag ==0) {
            return true;
        } else {
            return false;
        }
    }
}

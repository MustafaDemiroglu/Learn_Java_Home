package day12_forLoops;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 6; j >i ; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}

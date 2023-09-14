package day12_forLoops;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 6; j >i ; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}

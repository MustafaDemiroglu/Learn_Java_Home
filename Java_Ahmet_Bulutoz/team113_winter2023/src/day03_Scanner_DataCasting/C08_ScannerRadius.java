package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C08_ScannerRadius {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input 1 ");
        int input1 = scanner.nextInt();

        System.out.println("Enter input 2 ");
        int input2 = scanner.nextInt();

        System.out.println("Enter input 3 ");
        int input3 = scanner.nextInt();

        int value = input1 * input2 * input3;
        System.out.println(Math.sqrt(value));

        System.out.println("Enter radius ");
        int radius = scanner.nextInt();

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}

package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C07_BasicCalculatorApp {
    public static void main(String[] args) {
        System.out.println("Wellcome to my Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("First Number:");
        int firstNumber = input.nextInt();
        System.out.println("+, *, / or - ");
        input.nextLine(); // "Clearing the input buffer"
        char choice = input.nextLine().charAt(0);
        System.out.println("Second Number:");
        int secondNumber = input.nextInt();
        input.close();
        if (choice == '+') {
            System.out.println("this is your answer : " + (firstNumber+secondNumber));
        } else if (choice == '-') {
            System.out.println("this is your answer : " + (firstNumber-secondNumber));
        } else if (choice == '*') {
            System.out.println("this is your answer : " + (firstNumber*secondNumber));
        } else if (choice == '/') {
            System.out.println("this is your answer : " + (firstNumber/secondNumber));
        } else {
            System.out.println("not valid");
        }
    }
}

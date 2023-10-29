package day18_MultiDimensionalArrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C03_MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5},{2,3},{1}};

        // int[][] iki katli array belirtir
        // ilk [] ana array i (Outer array) kontrol eder
        // ikinci [] ise icerdeki arrayleri (innerarray) kontrol eder

        System.out.println(arr[1][1]);  // 3
        System.out.println(arr[0][2]);  // 5
        System.out.println(arr[2].length);  // 1
        System.out.println(arr[1]); // [I@15aeb7ab
        System.out.println(Arrays.toString(arr[1])); // [2, 3]
        System.out.println(Arrays.toString(arr));   // [[I@7b23ec81, [I@15aeb7ab, [I@6acbcfc0]
        System.out.println(Arrays.deepToString(arr));   // [[3, 4, 5], [2, 3], [1]]
        System.out.println(arr.length); // 3
        System.out.println();
    }
}

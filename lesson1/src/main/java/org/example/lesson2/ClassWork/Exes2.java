package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Exes2 {
    public static void main(String[] args) {
        System.out.println("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int[] resArr = numberSum(array);
        for (int elem: resArr) {
            System.out.print(elem + " ");
        }
    }

    private static int[] numberSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}

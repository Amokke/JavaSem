package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Exes3 {
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
        scanner.close();
    }

    /**
     * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param array исходный массив
     * @return
     */
    private static int[] numberSum(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((9 < array[i] && array[i] < 100) || (-9 > array[i] && array[i] > -100)){
                count += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = count;
            }
        }
        return array;
    }
}
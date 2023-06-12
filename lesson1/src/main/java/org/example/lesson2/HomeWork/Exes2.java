package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Exes2 {
    public static void main(String[] args) {
        System.out.println("Введите колличество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("hzadanie2(n, scanner) = " + hzadanie2(n, scanner));
        scanner.close();
    }

    /**
     * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n Колличество принимаемых чисел
     * @param scanner Прием ввода с клавиатуры
     * @return
     */
    private static boolean hzadanie2(int n, Scanner scanner) {
        int sum = 0;
        boolean flag = true;
        int i = 0;
        int n2 = 0;
        while (i < n && flag) {
            int n1 = scanner.nextInt();
            if (n1 > n2) {
                flag = true;
                n2 = n1;
                i++;
            }
            else{
                flag = false;
            }
        }
        return flag;
    }
}

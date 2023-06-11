package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args) {
        System.out.println("Введите колличество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("hzadanie1(n, scanner) = " + hzadanie1(n, scanner));
        scanner.close();
    }

    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n Колличество принимаемых чисел
     * @param scanner Прием ввода с клавиатуры
     * @return
     */
    private static int hzadanie1(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            int var = 2;
            for (int j = 0; j < n1; j++) {
                if (n1 > 1) {
                    if (n1 % var != 0) {
                        var++;
                    } else if (n1 == var) {
                        sum += n1;
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
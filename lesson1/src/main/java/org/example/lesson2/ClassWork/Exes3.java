package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Exes3 {
    public static void main(String[] args) {
        System.out.println("Введите колличество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie3(n, scanner) = " + zadanie3(n, scanner));
    }
    private static int zadanie3(int n, Scanner scanner) {
        int sum = 0;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) sum += n2;
            n1 = n2;
            }
        return sum;
    }
}

package org.example.lesson4.HomeWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество элиментов списка");
        int n = scanner.nextInt();
        scanner.close();
        zadanie1(n);
    }

    private static void zadanie1(int n) {
        LinkedList<Integer> linkedList = createList(n);
        System.out.println(linkedList);
        System.out.println("Перевернутый список");
        while (linkedList.size() > 0) {
            System.out.print(linkedList.pollLast() + " ");
        }
    }

    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}

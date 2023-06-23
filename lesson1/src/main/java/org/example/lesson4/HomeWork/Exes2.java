package org.example.lesson4.HomeWork;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Exes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобки");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(isValid(text));
    }

    public static boolean isValid(String text) {
        Deque<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' ||
                    text.charAt(i) == '{' ||
                    text.charAt(i) == '[')
                linkedList.add(text.charAt(i));
            else {
                if (linkedList.isEmpty())
                    return false;
                else if (text.charAt(i) == ')' && linkedList.getLast().equals('('))
                    linkedList.pollLast();
                else if (text.charAt(i) == '}' && linkedList.getLast().equals('{'))
                    linkedList.pollLast();
                else if (text.charAt(i) == ']' && linkedList.getLast().equals('['))
                    linkedList.pollLast();
                else
                    return false;
            }
        }
        return linkedList.isEmpty();
    }
}
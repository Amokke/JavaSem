package org.example.lesson4.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,-3,4,5,-6,7));
        System.out.println("linkedList = " + linkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) < 0) {
                linkedList.remove(i);
                --i;
            }
        }
        System.out.println("linkedList = " + linkedList);
    }
}

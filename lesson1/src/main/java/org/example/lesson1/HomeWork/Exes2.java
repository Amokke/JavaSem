package org.example.lesson1.HomeWork;

import java.util.Arrays;
import java.util.Scanner;


public class Exes2 {
    public static void main(String[] args){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] numArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("hzadanie2(numArr) = " + hzadanie2(numArr));
    }

    private static int hzadanie2(int[] numArr) {
        int sum = 0;
        for (int i = 0; numArr[i] != 0; i++) {
            if (numArr[i] > 0 && numArr[i + 1] < 0) {
                sum += numArr[i];
            }
        }
        return sum;
    }
}

package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args){
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));


        scanner.close();
    }

    private static int subtractProductAndSum(int n) {
        int sum = 0, pr = 1;
        while (n!=0){
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return 1;
    }
}

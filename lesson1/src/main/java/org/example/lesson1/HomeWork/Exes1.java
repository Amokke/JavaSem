package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("reverseWords(s) = " + reverseWords(s));
        scanner.close();
    }
    private static String reverseWords(String s) {
        String[] data = s.split("\s+");
        String res= "";
        for(int i=data.length-1;i>=0;--i){
            if(data[i].length()!=0){
                res += data[i]+ " ";
            }
        }
        return res.substring(0,res.length()-1);
    }
}

package org.example.lesson5.classwork;

import java.util.HashMap;
import java.util.Map;

public class Exes3 {
    public static void main(String[] args) {
        Map<Character, Integer> chIntMap = new HashMap<>();
        chIntMap.put('I', 1);
        chIntMap.put('V', 5);
        chIntMap.put('X', 10);
        chIntMap.put('L', 50);
        chIntMap.put('C', 100);
        chIntMap.put('D', 500);
        chIntMap.put('M', 1000);
        String str = "LVIII";
        System.out.println("zadanie3(chIntMap, str) = " + zadanie3(chIntMap, str));
    }

    private static int zadanie3(Map<Character, Integer> chIntMap, String str) {
        int result = chIntMap.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (chIntMap.containsKey(str.charAt(i))) {
                if (chIntMap.get(str.charAt(i)) < chIntMap.get(str.charAt(i + 1))) {
                    result -= chIntMap.get(str.charAt(i));
                } else {
                    result += chIntMap.get((str.charAt(i)));
                }
            }
            }
        return result;
    }
}

package org.example.lesson5.classwork;

import java.util.HashMap;
import java.util.Map;

public class Exes2 {
    public static void main(String[] args) {
        int[] array = {1,2,5,1,6};
        System.out.println("zadanie2(array) = " + zadanie2(array));
    }

    private static boolean zadanie2(int[] array) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (integerMap.containsKey(array[i])){
                return true;
            }
            else {
                integerMap.put(array[i], 1);
            }
        }
        return false;
    }

}

package org.example.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Exes1 {
    public static void main(String[] args) {
        String str = "qweqwe qweqwe qweqweqw qweqwe qw";
        zadanie1(str);
    }

    private static void zadanie1(String str) {
        Map<Character, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!mapCh.containsKey(str.charAt(i))) {
                    mapCh.put(str.charAt(i), 1);
                } else {
                    mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
            System.out.println(entry.getKey()+" встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}

package org.example.lesson5.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово: ");
        String findWord = scanner.nextLine();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";


        System.out.println(findWord + " - " + zadanie1(findWord, text));
    }

    private static int zadanie1(String findWord, String text) {
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }

        String[] arrayText = text.split(" ");
        Map<String, Integer> mapText = new HashMap<>();
        for (String currentWord : arrayText){
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())){
                continue;
            }

            int count = mapText.getOrDefault(findWord.toLowerCase(), 0);
            mapText.put(currentWord.toLowerCase(), ++count);
        }

        return mapText.getOrDefault(findWord.toLowerCase(), 0);
    }
}

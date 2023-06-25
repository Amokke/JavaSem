package org.example.lesson5.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Exes2 {
    public static void main(String[] args) {
        List<String> workers = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");
        System.out.println(workers);
        List<String> workersName = new ArrayList<>();
        List<String> workersSu = new ArrayList<>();
        for (String worker: workers) {
            String[] temp = worker.split(" ");
            workersName.add(temp[0]);
            workersSu.add(temp[1]);
        }
        System.out.println(workersName);
        System.out.println(workersSu);
        System.out.println("Полные повторения: " + repeat(workers));
        System.out.println("Повторения имен: " + repeat(workersName));
        System.out.println("Повторения Фамилий: " + repeat(workersSu));
    }


    public static Map<String, Integer> repeat(List<String> workers) {
        Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

        for (int i = 0; i < workers.size(); i++) {
            if (repeatNameCount.containsKey(workers.get(i))) {
                repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
            } else {
                repeatNameCount.put(workers.get(i), 1);
            }
        }

        Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }
}

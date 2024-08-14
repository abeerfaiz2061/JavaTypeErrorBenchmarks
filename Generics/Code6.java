package Generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code6<T, K> {
    private final List<T> items;
    private final Function<T, K> keyExtractor;
    private final Function<T, String> valueExtractor;

    public Code6(List<T> items, Function<T, K> keyExtractor, Function<T, String> valueExtractor) {
        this.items = items;
        this.keyExtractor = keyExtractor;
        this.valueExtractor = valueExtractor;
    }

    public void processItems() {
        Map<K, T> itemMap = items.stream()
                .collect(Collectors.toMap(keyExtractor, Function.identity()));
        itemMap.forEach((key, item) -> System.out.println(key + ": " + item));

        System.out.println("Sorted by key:");
        itemMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("Reverse sorted by key:");
        itemMap.entrySet().stream()
                .sorted(Map.Entry.<K, T>comparingByKey(Comparator.reverseOrder())) // This will cause a compile-time error
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("Sorted by value:");
        itemMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(valueExtractor)))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Samir", "Michael", "Milton");

        Code6<String, Integer> genericMapEmployees = new Code6<>(
                names,
                String::length, 
                Function.identity() 
        );

        genericMapEmployees.processItems();
    }
}

// Original Code Credits - https://github.com/kousen/generics
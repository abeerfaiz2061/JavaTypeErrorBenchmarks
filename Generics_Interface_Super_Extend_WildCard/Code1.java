package Generics_Interface_Super_Extend_WildCard;

import java.util.List;
import java.util.ArrayList;

// Generic interface
interface Transformer<T, R> {
    R transform(T input);
}

// Implementing the interface
class StringLengthTransformer implements Transformer<String, Integer> {
    @Override
    public Integer transform(String input) {
        return input.length();
    }
}

// Class using a generic transformer
class Code1 {

    // Method with upper bounded wildcard
    public static <T, R> List<R> processItems(List<T> items, Transformer<? super T, ? extends R> transformer) {
        List<R> results = new ArrayList<>();
        for (T item : items) {
            results.add(transformer.transform(item));
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        Transformer<Object, Integer> transformer = new StringLengthTransformer(); // Compile-time error: incompatible types
        List<Integer> lengths = Code1.processItems(strings, transformer);

        System.out.println(lengths); // Output: [5, 6, 6]
    }
}


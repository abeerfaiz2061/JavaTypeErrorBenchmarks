package Generics_Interface_Super_Extend_WildCard;

import java.util.List;
import java.util.ArrayList;

interface Transformer<T, R> {
    R transform(T input);
}

class StringLengthTransformer implements Transformer<String, Integer> {
    @Override
    public Integer transform(String input) {
        return input.length();
    }
}

class Code1 {

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

        Transformer<Object, Integer> transformer = new StringLengthTransformer();
        List<Integer> lengths = Code1.processItems(strings, transformer);

        System.out.println(lengths);
    }
}


import java.util.Arrays;
import java.util.List;

public class Code8 {
    public static void main(String[] args) {

        List<Double> list1 = Arrays.asList(1.9, 1.3);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList(1, 2.0, 3L);

        printNumbers(list1);
        printNumbers(list2);
        printNumbers(list3);

        addNumber(list3, 42);
    }

    static void printNumbers(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

    static void addNumber(List<? extends Number> list, Number number) {
        list.add(number);
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics

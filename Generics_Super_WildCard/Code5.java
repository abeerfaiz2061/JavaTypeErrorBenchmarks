import java.util.Arrays;
import java.util.List;

public class Code5 {
    public static void main(String[] args) {

        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList(3.14, 2.71);

        printNumbers(list2);
        printNumbers(list3);

        List<Number> list4 = Arrays.asList(1, 2.0);

        addNumber(list4, 42);
    }

    static void printNumbers(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }

    static <T> void addNumber(List<? super Integer> list, T number) {

        list.add(number);
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Code3 {

    public static <T> void processList(List<? super Object> list, T element) {
        
        list.add(element); 
        
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> strings = Stream.of("a", "few", "strings")
                .collect(Collectors.toList());

        processList(strings, "another");

        List<Integer> integers = Stream.of(3, 1, 4, 1, 5, 9)
                .peek(i -> System.out.println(i + " as a binary string is " + Integer.toBinaryString(i)))
                .peek((Number n) -> System.out.println("The double value of " + n + " is " + n.doubleValue()))
                .peek((Object o) -> System.out.println("The default hashcode of " + o + " is " + o.hashCode()))
                .collect(Collectors.toList());
        System.out.println(integers);

        processList(integers, 10);
    }
}

// Original Code Credits - https://github.com/kousen/generics
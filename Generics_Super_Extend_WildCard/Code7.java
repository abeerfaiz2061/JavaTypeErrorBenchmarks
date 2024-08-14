import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code7 {

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToListWithUpperBound(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T> void addToCollection(List<? super T> list, T element) {
        list.add(element);
    }

    public static <T> void processAndPrint(List<? extends Number> list) {
        list.add(10); 
        
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        processAndPrint(intList);

        List<Number> numberList = Arrays.asList(1, 2.5, 3.14);
        addToCollection(numberList, 10);
        numberList.forEach(System.out::println);
    }
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
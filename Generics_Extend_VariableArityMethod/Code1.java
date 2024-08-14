import java.util.ArrayList;
import java.util.List;

class Code1 {
    public static <T extends Number> List<T> toList(T... arr) {
        List<T> list = new ArrayList<>();
        for (T elt : arr) {
            list.add(elt);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> intList = Code1.toList(1, 2, 3);

        List<String> strList = Code1.toList("a", "b", "c");
    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
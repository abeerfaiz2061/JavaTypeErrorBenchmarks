import java.util.ArrayList;
import java.util.List;

public class Code11 {

    public static <T extends Number> void reverse(List<T> list) {
        List<? extends Number> tmp = new ArrayList<T>(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        reverse(numbers);
    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
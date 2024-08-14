import java.util.ArrayList;
import java.util.List;

public class Code8 {

    public static <T> void copy(List<T> dst, List<T> src) {
        dst.set(0, src.get(0));
    }

    public static <T> void copyUpperBound(List<T> dst, List<? extends T> src) {
        src.add(dst.get(0));
    }

    public static <T> void copyLowerBound(List<? super T> dst, List<T> src) {
        T element = dst.get(0); 
    }

    public static <T> void copyBounded(List<? super T> dst, List<? extends T> src) {
        dst.set(0, src.get(0));

        T element = dst.get(0);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        copy(integers, strings);

    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
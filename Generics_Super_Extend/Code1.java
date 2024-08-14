import java.util.List;

public class Code1 {

    public static <T> void copy(List<? extends T> dst, List<? super T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    public static void main(String[] args) {

    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
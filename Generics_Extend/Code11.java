import java.util.List;

public class Code11 {

    public static <T> boolean occursExactTimes(List<T> items, T item, int times) {
        int count = 0;
        for (T anItem : items) {
            if (anItem.equals(item)) {
                count++;
            }
        }
        return count == times;
    }

    public static <T extends Comparable<T>> int countSmaller(List<T> items, T item) {
        int countSmaller = 0;
        for (T anItem : items) {
            if (anItem.compareTo(item) < 0) {
                countSmaller++;
            }
        }
        return countSmaller;
    }

    public static <T> T invalidMethod(List<T> items, T item) {
        return item + items.get(0);
    }
}

// Original Code Credits - https://github.com/custersnele/JavaAdv_H5_Generics
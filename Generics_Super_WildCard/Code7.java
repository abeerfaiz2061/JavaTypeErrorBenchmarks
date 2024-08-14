import java.util.Comparator;
import java.util.List;

public class Code7 {

    public static <E> Comparator<List<E>> listComparator(final Comparator<? super E> comp) {
        return new Comparator<List<E>>() {
            @SuppressWarnings("unchecked")
            public int compare(List<E> list1, List<E> list2) {
                int n1 = list1.size();
                int n2 = list2.size();
                for (int i = 0; i < Math.min(n1, n2); i++) {
                    int k = ((Comparator<Integer>) comp).compare(list1.get(i), list2.get(i)); 
                    if (k != 0) return k;
                }
                return (n1 < n2) ? -1 : (n1 == n2) ? 0 : 1;
            }
        };
    }

    public static void main(String[] args) {
        Comparator<Integer> intComp = Integer::compare;
        Comparator<List<Integer>> comp = listComparator(intComp);
    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
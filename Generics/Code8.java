import java.util.ArrayList;
import java.util.List;

public class Code8<T> {

    private T root;

    public Code8(T root) {
        this.root = root;
    }

    public <E> List<E> addItemsToList(List<E> items, List<T> elements) {
        items.addAll(elements);
        return items;
    }

    public static void main(String[] args) {
        Code8<String> tree = new Code8<>("Root");

        List<String> stringList = new ArrayList<>();
        stringList.add("Item1");
        stringList.add("Item2");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        List<String> resultList = tree.addItemsToList(stringList, integerList);
        resultList.forEach(System.out::println);
    }
}

// Original Code Credits - https://github.com/c05mic/GenericN-aryTree
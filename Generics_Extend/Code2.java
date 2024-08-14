import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code2<T> {
    private Map<T, T> map = new HashMap<>();

    public void setMap(Map<T, T> map) {
        this.map = map;
    }

    public Map<T, T> getMap() {
        return map;
    }

    public Map<T, T> getMapSortedByKey() {
        return map.entrySet().stream()
                .sorted(Map.Entry.<T, T>comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }


    public <U extends T> Map<T, U> getMapSortedByValue() {

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "Alice");
        testMap.put(2, "Bob");
        testMap.put(3, "Charlie");

        Code2<Integer> sortingMaps = new Code2<>();
        sortingMaps.setMap(testMap);

        System.out.println("Sorted by key:");
        sortingMaps.getMapSortedByKey().forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Sorted by value:");
        sortingMaps.getMapSortedByValue().forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

// Original Code Credits - https://github.com/kousen/generics
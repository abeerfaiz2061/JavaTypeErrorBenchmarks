import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Comparator;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toMap;

public class Code6<K extends Comparable<? super K>, V> {
    private Map<K, V> map = new HashMap<>();

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    public Map<K, V> getMap() {
        return map;
    }

    public Map<K, V> getMapSortedByKey() {
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByKey()) 
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByKeyDesc() {
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByKey(reverseOrder())) 
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByValue() {
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByValue()) 
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByValueDesc() {
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByValue(reverseOrder())) 
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}

// Original Code Credits - https://github.com/kousen/generics
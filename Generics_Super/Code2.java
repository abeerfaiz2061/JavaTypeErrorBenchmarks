package Generics_Super;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code2 {
    
    <T> List<T> foo(Map<T, ? super T> a) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        
        Map<Number, Integer> m = new HashMap<>();
        List<Integer> ret = foo(m);
    }

    
}

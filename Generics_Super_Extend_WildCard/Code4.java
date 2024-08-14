
package Generics_Super_Extend_WildCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Code4 {

    <T, S extends Map<Number,T>> List <T> baz(Map<T, ? super T> a, S b) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Map<Object, Number> mt = new HashMap<>();
        Map<Number, String> ms = new HashMap<>();
        List<Integer> ret = baz(mt,ms);
    }
    
}
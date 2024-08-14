package Generics_Super_Extend_WildCard;

import java.util.HashMap;
import java.util.Map;

public class Code3 {
    
    <T, S extends T> void bar(Map<S, ? extends T> a, Map<T, T> b) {}
    
    <T, S extends T, R> void baz(Map<S, ? extends R> a, Map<T, T> b, Map<R, R> c) {}
    

    public static void main(String[] args) {
        Map<Integer, ? super Double> sm = new HashMap<>();
        Map<String, Number> tm = new HashMap<>();
        bar(sm, tm);


        Map<Object, Number> rm = new HashMap<>();
        baz(sm, tm, rm);
    }
    

}

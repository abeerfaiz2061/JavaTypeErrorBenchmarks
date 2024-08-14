package Generics_Super;

import java.util.HashMap;
import java.util.Map;

class Code1 {

    <T, S extends T, R extends S> void foo(Map<T, T> a, Map<S, S> b, Map<R, R> c) {}
    
    public static void main(String[] args) {
        Map <Integer, Double> m1 = new HashMap<>();
        Map <Integer, Byte> m2 = new HashMap<>();
        Map <Integer, Byte> m3 = new HashMap<>();
        foo(m1, m2, m3);
    }    
}




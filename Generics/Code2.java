package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code2 {
    
    <T> void foo(Map<T, T> a, List <T> b, List <T> c, List <T> d) {}

    public static void main(String[] args) {
        Map <Number, Number> m = new HashMap<>();
        List <Integer> l = new ArrayList<>();
        List <Integer> l2 = new ArrayList<>();
        foo(m, l, l, l2);
    }

    // code from Corrective Hints Paper by Jurr
}

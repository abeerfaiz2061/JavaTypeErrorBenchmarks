package Generics;

import java.util.ArrayList;
import java.util.List;

public class Code3 {

    <T> void foo(List<T> a, List<T> b, List<T> c) {
        T itemFromA = a.get(0); 
        b.add(itemFromA);
        c.add(itemFromA);
    }

    public static void main(String[] args) {
        Code3 instance = new Code3();
        List<Number> src = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        List<Double> small = new ArrayList<>();

        foo(src, big, small);

        src.add(1.0);
        big.add(2);
        small.add(3.0);
    }
}

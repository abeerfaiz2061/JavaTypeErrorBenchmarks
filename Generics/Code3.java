package Generics;

import java.util.ArrayList;
import java.util.List;

public class Code3 {

    // Method with generic parameters
    <T> void foo(List<T> a, List<T> b, List<T> c) {
        // Using the lists in a way that introduces type incompatibility
        T itemFromA = a.get(0); 
        b.add(itemFromA);
        c.add(itemFromA);
    }

    public static void main(String[] args) {
        Code3 instance = new Code3();
        List<Number> src = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        List<Double> small = new ArrayList<>();

        // This call is problematic because the types do not align
        foo(src, big, small); // Error: Incompatible types

        src.add(1.0); // Number
        big.add(2);   // Integer
        small.add(3.0); // Double
    }
}

package Generics;

import java.util.ArrayList;
import java.util.List;

public class Code1 {
    
    <T> void foo(List <T> a, List <T> b, List <T> c){}

    public static void main(String[] args) {
        List <Number> src = new ArrayList<>();
        List <Integer> big = new ArrayList<>();
        List <Integer> small = new ArrayList<>();
        foo(src, small, big);
        foo(src, src, big);
    }
    
    // code from Corrective Hints Paper by Jurr

}

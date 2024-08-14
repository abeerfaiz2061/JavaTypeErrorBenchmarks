package Generics_Super_Extend_WildCard;

import java.util.HashMap;
import java.util.Map;

public class Code2 {
    
    static <T extends Number> void foo(Map<? super T, ? super T> a) {}

    public static void main(String[] args) {
        Map<String, Number> m1 = new HashMap<>();
        foo(m1);
        Map<Number, String> m2 = new HashMap<>();
        foo(m2);
    }
    
}

// code from correct hints paper
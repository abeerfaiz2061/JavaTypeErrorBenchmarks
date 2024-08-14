package Generics_Super_Extend_WildCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code5 {
    
    <T extends Number> List <T> bar(Map<T, T> a, List<? extends T> b) { 
        return new ArrayList<>();
    }
   
    public static void main(String[] args) {
        Map<Boolean, String> m = new HashMap<>();
        List<? super Number> l = new ArrayList<>();
        List<Integer> i = bar(m, l);
    }
    
}

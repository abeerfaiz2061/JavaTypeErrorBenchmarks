package Generics_Super_Extend_WildCard;

import java.util.Map;

public class Code1 {
    
    <T> void foo(Map<? super T, ? super T> a, Map<? extends T, ? extends T> b){}

    public static void main(String[] args) {
        
        Map<Number, Integer> ma = null;
        Map<Number, String> mb = null;
        foo(ma, mb);
    }
}

//code from corrective hint paper
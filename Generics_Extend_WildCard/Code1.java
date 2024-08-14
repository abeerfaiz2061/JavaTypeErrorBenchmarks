import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Code1 {
    
    <T> List<T> foo(Map<T, ? extends T> a){
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Map<Number, Integer> m = null;
        List<Integer> ret = foo(m);
    }
}

// code from Corrective Hints Paper by Jurr
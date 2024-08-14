import java.util.ArrayList;
import java.util.List;

public class Code11 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Float> list2 = new ArrayList<>();
        
        if (compareLists(list1, list2)) {
            System.out.println("Lists are comparable.");
        }
    }

    public static <T> boolean compareLists(List<T> l1, List<T> l2) {
        return l1.getClass() == l2.getClass();
    }
}

// Original Code Credits - https://github.com/custersnele/JavaAdv_H5_Generics
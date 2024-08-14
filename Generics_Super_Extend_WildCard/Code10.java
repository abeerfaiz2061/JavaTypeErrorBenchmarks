import java.util.ArrayList;
import java.util.List;

public class Code10 {

    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        List<? super Number> sink = nums;
        List<? extends Integer> source = nums;

        for (int i = 0; i < 10; i++) {
            sink.add(i);
        }

        double sum = 0;
        for (Number num : source) { 
            sum += num.doubleValue();
        }

        System.out.println("Sum: " + sum);
    }
}

// Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
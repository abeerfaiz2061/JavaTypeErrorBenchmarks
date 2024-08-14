import java.util.ArrayList;
import java.util.List;

public class Code4<T extends Number> {
    @SafeVarargs
    public final void addNumbers(List<? super T> list, T... numbers) {
        for (T number : numbers) {
            list.add(number);
        }
    }
    
    public static void main(String[] args) {
        Code4<Integer> example = new Code4<>();
        List<Number> numberList = new ArrayList<>();
        
        // Compile-time error: incompatible types: String cannot be converted to Integer
        example.addNumbers(numberList, 1, 2, "Three");
    }
}

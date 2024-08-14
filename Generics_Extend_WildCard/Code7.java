import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code7 {
    public static void main(String[] args) {
    
        List<String> names = new ArrayList<>();
        names.add("1");

       
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

      
        Map<String, String> map = new HashMap<>();

      
        Map<Point, Double> map2 = new HashMap<>();

        List<? extends Number> numList = new ArrayList<Integer>();
    
        List<? extends Number> numList2 = new ArrayList<String>();

        Map<Point, Integer> invalidMap = new HashMap<>();

        invalidMap.put(new Point(0, 0), "Not an Integer");


        List<?> wildcardList = new ArrayList<String>();

        List<Integer> integerList = (List<Integer>) wildcardList;
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics
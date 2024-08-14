import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Code1 {
    public static void main(String[] args) {

        List<Object> list1 = Arrays.asList("11", 2, new Date());
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");

        print(list1);
        print(list2);
        print(list3);


        addElement(list1, 100); 
        addElement(list2, "test"); 
    }

    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }


    static <T> void addElement(List<?> list, T element) {
        list.add(element); 
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics
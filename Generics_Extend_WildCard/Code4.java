import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Code4 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(LocalDate.now());
        objects.add(3);

        System.out.println(objects);

        List<? extends Object> wildcardObjects = objects;

        wildcardObjects.add("New String");
    }
}

// Original Code Credits - https://github.com/kousen/generics
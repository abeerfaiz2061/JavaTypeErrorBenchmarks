import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class Code4 {
    public static void main(String[] args) {
        List<?> stuff = Arrays.asList("Hello", LocalDate.now(), 3);

        System.out.println(stuff.size());
        stuff.forEach((Object o) -> System.out.println(o));

        addToList(stuff, "New Element"); 

        stuff.containsAll(Arrays.asList("Whatever", "else")); 
    }


    public static <T> void addToList(Collection<? super T> collection, T element) {
        collection.add(element);
    }
}

// Original Code Credits - https://github.com/kousen/generics
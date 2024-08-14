import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Code2 {
	public static void printCollection(Collection<?> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}

	public static <T> void addElement(Collection<T> c, T element) {
	    c.add(element);
	}

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("ArrayList Collection");
		printCollection(collection);
		
		Collection<String> collection2 = new LinkedList<>();
		collection2.add("LinkedList Collection");
		printCollection(collection2);
		
		Collection<String> collection3 = new HashSet<>();
		collection3.add("HashSet Collection");
		printCollection(collection3);
		
		addElement(collection, 123); 
	}
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
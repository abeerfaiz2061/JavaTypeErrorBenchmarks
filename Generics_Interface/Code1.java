public class Code1 {
	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
		
		OrderedPair<String, Employee> p3 = new OrderedPair<>("key", new Employee("Ramesh"));
		System.out.println(p3.getKey());
		System.out.println(p3.getValue().getName());
		
		// Introduce a compile-time type error here
		// The error is introduced by assigning a pair of incompatible types
		// which cannot be safely cast or assigned
		OrderedPair<String, Integer> p4 = new OrderedPair<>(new Employee("John"), "Doe"); // Error
		System.out.println(p4.getKey()); // This will cause a compile-time error
		System.out.println(p4.getValue()); // This will also cause a compile-time error
	}
}

class Employee {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
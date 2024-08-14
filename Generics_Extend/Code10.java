public class Code10 {

	public static <T> boolean isEqual(GenType<T> g1, GenType<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
	}

	public static void main(String args[]){
		GenType<String> g1 = new GenType<>();
		g1.set("demo");
		
		GenType<String> g2 = new GenType<>();
		g2.set("demo");
		
		boolean isEqual = Code10.<String>isEqual(g1, g2);
		
		System.out.println(isEqual);
	
		isEqual = Code10.isEqual(g1, g2);
		
		System.out.println(isEqual);

		System.out.println(Code10.compare(123, "abc"));
	}
}

class GenType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
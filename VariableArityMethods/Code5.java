public class Code5<T extends Number & Comparable<T>> {
    @SafeVarargs
    public final void compareItems(T... items) {
        for (T item : items) {
            System.out.println(item.compareTo(item));
        }
    }
    
    public static void main(String[] args) {
        Code5<Integer> example = new Code5<>();
        
        // Compile-time error: incompatible types: String cannot be converted to Integer
        example.compareItems(1, 2, "Three");
    }
}

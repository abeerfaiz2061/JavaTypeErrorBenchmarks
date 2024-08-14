public class Code6<T> {
    public void unsafeMethod(T... args) {
        T[] array = new T[10];
    }
    
    public static void main(String[] args) {
        Code6<String> example = new Code6<>();
        example.unsafeMethod("Hello", "World");
    }
}

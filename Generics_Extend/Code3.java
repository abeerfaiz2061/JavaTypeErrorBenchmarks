public class Code3<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }


    public <U> void setAndPrint(U u) {

        System.out.println("Setting value: " + u);
        set((T) u); 
    }

    public <U extends T> void setAndProcess(U u) {
 
        set(u);
        System.out.println("Processed value: " + get());
    }

    public static void main(String[] args) {
        Code3<Number> box = new Code3<>();
        box.set(10);
        System.out.println("Box contains: " + box.get());


        box.setAndPrint(10.5); 

        box.setAndProcess("Test"); 
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics
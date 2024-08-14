public class Code10<T> {

    private static T value;

    private T t;

    public Code10() {
         t = new T();
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public boolean test() {
      return t instanceof T;
    }
}

// Original Code Credits - https://github.com/custersnele/JavaAdv_H5_Generics

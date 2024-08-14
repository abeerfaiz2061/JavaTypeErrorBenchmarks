public class Code9<T> {
    private T first;
    private T second;

    public Code9(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setBoth(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void addToBoth(T element) {
        this.first = (T) ((Integer) this.first + (Integer) element);
        this.second = (T) ((Integer) this.second + (Integer) element);
    }

    public static void main(String[] args) {
        Code9<Integer> intDuo = new Code9<>(1, 2);
        System.out.println("First: " + intDuo.getFirst());
        System.out.println("Second: " + intDuo.getSecond());

        Code9<String> strDuo = new Code9<>("Hello", "World");
        strDuo.addToBoth("Test");

        intDuo.addToBoth(10);
        System.out.println("Updated First: " + intDuo.getFirst());
        System.out.println("Updated Second: " + intDuo.getSecond());
    }
}

// Original Code Credits - https://github.com/custersnele/JavaAdv_H5_Generics
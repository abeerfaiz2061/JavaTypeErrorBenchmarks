public class Code1 {
    public static void process(int... numbers) {
        System.out.println("Processing int varargs");
    }

    public static void process(String... strings) {
        System.out.println("Processing String varargs");
    }

    public static void main(String[] args) {
        process(1, "two");
    }
}

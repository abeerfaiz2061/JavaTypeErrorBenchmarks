public class Code7 {
    public static void process(String... strings) {
        System.out.println("String varargs");
    }

    public static void process(String[] s) {
        System.out.println("Single String");
    }

    public static void main(String[] args) {
        process();
    }
}

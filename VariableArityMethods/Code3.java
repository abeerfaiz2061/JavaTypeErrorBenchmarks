public class Code3 {
    public static void process(Integer... numbers) {
        System.out.println("Integer varargs");
    }

    public static void process(int... numbers) {
        System.out.println("int varargs");
    }

    public static void process(Double... numbers) {
        System.out.println("Double varargs");
    }

    public static void process(double... numbers) {
        System.out.println("double varargs");
    }

    public static void main(String[] args) {
        process();
    }
}

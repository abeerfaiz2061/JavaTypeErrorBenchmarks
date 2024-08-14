public class Code2 {
    public static void display(Integer... numbers) {
        System.out.println("Integer varargs");
    }

    public static void display(int... numbers) {
        System.out.println("int varargs");
    }

    public static void main(String[] args) {
        display(1, 2, 3L);
    }
}

public class Code6 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println(
                countGreaterThan(numbers, 0)
        );

        Double[] numbers2 = {1.0, 2.0, 3.8};
        System.out.println(
                countGreaterThan(numbers2, .9)
        );

        System.out.println(
                countGreaterThan(numbers, 1.0)
        );
    }

    interface A {}
    interface B {}


    static <T extends Comparable<T>> int countGreaterThan(
            T[] numbers,
            T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }


    static <T extends Comparable<T>> int countGreaterThanWithBound(
            T[] numbers,
            T number,
            Class<? extends T> clazz) {

        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics
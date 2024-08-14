public class Code1 {
    public static void main(String args[]) {
        Integer intOfArray[] = { 3, 6, 2, 8, 6 };
        Character charOfArray[] = { 'A', 'r', 'V', 'w' };
        String strOfArray[] = {"abc", "xyz", "pqr"};
        
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>(intOfArray);
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>(charOfArray);
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>(strOfArray);

        System.out.println("Max value in intOfArray: " + intMinMax.max());
        System.out.println("Min value in intOfArray: " + intMinMax.min());

        System.out.println("Max value in charOfArray: " + charMinMax.max());
        System.out.println("Min value in charOfArray: " + charMinMax.min());
        
        System.out.println("Max value in strOfArray: " + strMinMax.max());
        System.out.println("Min value in strOfArray: " + strMinMax.min());
    }
}

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

class MinMaxImpl<T> implements MinMax<T> {
    T[] vals;

    MinMaxImpl(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (((Comparable<T>)vals[i]).compareTo(v) < 0) { // Unsafe cast leading to compile-time error
                v = vals[i];
            }
        }

        return v;
    }

    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (((Comparable<T>)vals[i]).compareTo(v) > 0) { // Unsafe cast leading to compile-time error
                v = vals[i];
            }
        }

        return v;
    }
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
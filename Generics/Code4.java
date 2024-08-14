package Generics;

import java.awt.*;
import java.util.Arrays;
import java.util.function.Function;

public class Code4 {
     private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color applyFilter(Function<Color, Color> filter) {
        return filter.apply(color);
    }

    @SafeVarargs
    public final <T> T applyFilters(Function<Color, T>... filters) {
        return Arrays.stream(filters)
                .reduce(Function.identity(), Function::andThen) 
                .apply(color);
    }

    public static void main(String[] args) {
        Code4 test = new Code4();
        test.setColor(Color.RED);

        Function<Color, String> filter1 = c -> c.toString();
        Function<Color, Integer> filter2 = c -> c.getRed();

        test.applyFilters(filter1, filter2);
    }
}

// Original Code Credits - https://github.com/kousen/generics
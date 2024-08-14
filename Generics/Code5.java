package Generics;

import java.awt.*;
import java.util.function.UnaryOperator;

public class Code5 {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color applyFilter(UnaryOperator<Color> filter) {
        return filter.apply(color);
    }

    public static void main(String[] args) {
        Code5 test = new Code5();
        test.setColor(Color.BLUE);

        UnaryOperator<Color> colorFilter = (Color c) -> {
            if (c.getRed() > 128) {
                return "Bright Color"; 
            } else {
                return c.darker();
            }
        };

        test.applyFilter(colorFilter);
    }
}

// Original Code Credits - https://github.com/kousen/generics
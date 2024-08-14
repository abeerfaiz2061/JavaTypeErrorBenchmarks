import java.util.ArrayList;
import java.util.List;

// Generic class with an upper bound
class Box<T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // Method using upper bounded wildcard
    public static void printBoxes(List<? extends Box<? extends Number>> boxes) {
        for (Box<? extends Number> box : boxes) {
            System.out.println("Box contains: " + box.getValue());
        }
        boxes.add(new Box<>(3)); // Compile-time error: Cannot add to list with bounded wildcard
    }

    // Method using lower bounded wildcard
    public static void addBox(List<? super Box<Number>> boxes) {
        boxes.add(new Box<>(5));
        boxes.add(new Box<>(10.5));
        boxes.add(new Box<>("string")); // Compile-time error: String is not a Number
    }
}

public class Code2 {
    public static void main(String[] args) {
        List<Box<? extends Number>> boxes = new ArrayList<>();
        boxes.add(new Box<>(1));
        boxes.add(new Box<>(2.5));

        Box.printBoxes(boxes); // Valid usage of upper bounded wildcard

        List<Box<Number>> numberBoxes = new ArrayList<>();
        Box.addBox(numberBoxes); // Valid usage of lower bounded wildcard
    }
}

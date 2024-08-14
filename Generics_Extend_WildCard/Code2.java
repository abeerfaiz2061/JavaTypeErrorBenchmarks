import java.util.ArrayList;
import java.util.List;

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

    public static void printBoxes(List<? extends Box<? extends Number>> boxes) {
        for (Box<? extends Number> box : boxes) {
            System.out.println("Box contains: " + box.getValue());
        }
        boxes.add(new Box<>(3));
    }

    public static void addBox(List<? super Box<Number>> boxes) {
        boxes.add(new Box<>(5));
        boxes.add(new Box<>(10.5));
        boxes.add(new Box<>("string"));
    }
}

public class Code2 {
    public static void main(String[] args) {
        List<Box<? extends Number>> boxes = new ArrayList<>();
        boxes.add(new Box<>(1));
        boxes.add(new Box<>(2.5));

        Box.printBoxes(boxes);

        List<Box<Number>> numberBoxes = new ArrayList<>();
        Box.addBox(numberBoxes);
    }
}

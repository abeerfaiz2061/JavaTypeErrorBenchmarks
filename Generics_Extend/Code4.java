import java.util.Date;

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends T> void addItem(U item) {
        set(item); 
    }
}

class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" + "model='" + model + '\'' + '}';
    }
}

class Letter {
    private String content;

    public Letter(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Letter{" + "content='" + content + '\'' + '}';
    }
}

public class Code4 {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("Samsung"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Amigoscode"));
        System.out.println(box2.get());

        
        Box<Phone> box3 = new Box<>();
        box3.addItem(new Letter("This is a letter")); 
    }
}

// Original Code Credits - https://github.com/amigoscode/java-generics

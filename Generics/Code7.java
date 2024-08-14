public class Code7<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        
        Code7<Integer> type = new Code7<>();
        type.set(10);
        System.out.println(type.get());
        
        Code7<String> typeStr = new Code7<>();
        typeStr.set("String");
        System.out.println(typeStr.get());
        
        Code7<Student> genericType = new Code7<>();
        Student student = new Student();
        student.setName("Ramesh");
        genericType.set(student);
        System.out.println(genericType.get());
        
        @SuppressWarnings("rawtypes")
        Code7 rawType = new Code7(); 
        rawType.set("Ramesh");
        rawType.set(10); 

        Code7<String> typeStrFromRaw = (Code7<String>) rawType; 
        typeStrFromRaw.set("New String"); 

        typeStrFromRaw.set(123);

        System.out.println("Raw Type :" + rawType.get());
        System.out.println("TypeStrFromRaw :" + typeStrFromRaw.get());
    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

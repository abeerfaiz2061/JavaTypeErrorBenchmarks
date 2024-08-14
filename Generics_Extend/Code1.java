package Generics_Extend;

class A {
    public void displayClass() {
        System.out.println("Inside class A");
    }
}

class B{
    @Override
    public void displayClass() {
        System.out.println("Inside class B");
    }
}

class C {
    @Override
    public void displayClass() {
        System.out.println("Inside class C");
    }
}

public class Code1<T extends A> {
    private T t;

    public Code1(T t) {
        this.t = t;
    }

    public void doRunTest() {
        this.t.displayClass();
    }

    public static void main(String[] args) {
        Code1<C> bec = new Code1<>(new C());
        bec.doRunTest();

        Code1<B> beb = new Code1<>(new B());
        beb.doRunTest();
    }
} 

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
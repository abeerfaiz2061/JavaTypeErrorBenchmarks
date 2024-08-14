public class Code7<T extends A> {
    private T t;

    public Code7(T t){
        this.t = t;
    }

    public void doRunTest() {
        this.t.displayClass();
    }

    public <U extends A> void invalidMethod(U obj) {
        if (obj instanceof T) {
            T casted = (T) obj; 
            casted.displayClass(); 
        }
    }

    public static void main(String[] args) {

        Code7<C> bec = new Code7<C>(new C());
        bec.doRunTest();

        Code7<B> beb = new Code7<B>(new B());
        beb.doRunTest();

        Code7<A> bea = new Code7<A>(new A());
        bea.doRunTest();
        
        bec.invalidMethod(new B()); 

        bec.invalidMethod(new C());
    }
}

class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
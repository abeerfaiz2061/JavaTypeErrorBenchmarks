public class Code8 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // This will now fail due to the generic type constraint
        GenericFactory<ProductA> factoryA = new GenericFactory<>(ProductA.class);
        ProductA productA = factoryA.createInstance();
        System.out.println(productA.getProductName());

        // This will now fail due to the generic type constraint
        GenericFactory<ProductB> factoryB = new GenericFactory<>(ProductB.class);
        ProductB productB = factoryB.createInstance();
        System.out.println(productB.getProductName());
        
        // This will now fail due to the generic type constraint
        GenericFactory<ProductC> factoryC = new GenericFactory<>(ProductC.class);
        ProductC productC = factoryC.createInstance();
        System.out.println(productC.getProductName());
    }
}

// Constraint added here
class ProductA {
    public String getProductName() {
        return "Product A";
    }
}

class ProductB {
    public String getProductName() {
        return "Product B";
    }
}

class ProductC {
    public String getProductName() {
        return "Product C";
    }
}

// Adding a constraint that only allows ProductA type and introducing a type mismatch error
class GenericFactory<T extends ProductA> {

    Class<T> theClass = null; // Changed to generic class type

    public GenericFactory(Class<T> theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return theClass.newInstance(); // Safe cast due to generics, but will fail at compile time if T does not extend ProductA
    }
}

// Original Code Credits - https://github.com/RameshMF/java-generics-guide
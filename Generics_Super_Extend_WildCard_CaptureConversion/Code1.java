import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Code1<E extends InputStream> {
    // Method to read from the InputStream
    public void readFromIt(E readFrom) throws IOException {
        readFrom.read();
    }
    
    public static void main(String[] args) throws Exception {
        // Creating an instance of Code1 with a wildcard that has a lower bound of InputStream
        // This means the type argument is restricted to InputStream or its subclasses
        // However, we are assigning Code1<FilterInputStream> to Code1<? super InputStream>
        Code1<? super InputStream> ce = new Code1<FilterInputStream>();
        
        // Creating an instance of BufferedInputStream, which is a subclass of FilterInputStream
        BufferedInputStream obj = new BufferedInputStream(new FileInputStream("somefile"));
        
        // Attempting to call readFromIt with BufferedInputStream
        // This will lead to a compile-time error because the method expects a type that is exactly InputStream
        // but the wildcard bound restricts it to FilterInputStream or its superclasses
        ce.readFromIt(obj);  // Compile-time error
    }
}

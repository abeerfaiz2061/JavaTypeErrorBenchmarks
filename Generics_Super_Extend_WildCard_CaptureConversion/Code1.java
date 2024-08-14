import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Code1<E extends InputStream> {
    public void readFromIt(E readFrom) throws IOException {
        readFrom.read();
    }
    
    public static void main(String[] args) throws Exception {
        
        Code1<? super InputStream> ce = new Code1<FilterInputStream>();
        
        BufferedInputStream obj = new BufferedInputStream(new FileInputStream("somefile"));
        
        ce.readFromIt(obj);
    }
}

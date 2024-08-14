import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Code1<E extends InputStream> {
    public void readFromIt(E readFrom) throws IOException{
        readFrom.read();
    }
    
    public static void main(String [] args) throws Exception{
        Code1<?> ce=new Code1<InputStream>();
        
        Object obj=new Object();
        ce.readFromIt(obj);
    }
}
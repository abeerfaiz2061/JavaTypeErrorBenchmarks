import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class Code2<E extends InputStream> {
    public void readFromIt(E readFrom) throws IOException{
        readFrom.read();
    }
    
    public static void main(String [] args) throws Exception{
        
        Code2<? extends Serializable> ce=new Code2<InputStream>();
        
    }
}
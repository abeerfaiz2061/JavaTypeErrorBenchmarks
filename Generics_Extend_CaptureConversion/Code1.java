import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Code1<E extends InputStream> {
    public void readFromIt(E readFrom) throws IOException{
        readFrom.read();
    }
    
    public static void main(String [] args) throws Exception{
        //The ce is passed only ? as a type argument. Hence the capture converted type has an upper
        //bound same as the original bound during the declaration, which is InputStream
        //Note that it is not possible to create an Object of wildcard type. That is a compile
        //time error
        Code1<?> ce=new Code1<InputStream>();
        
        Object obj=new Object();
        ce.readFromIt(obj);//This is an error, because the capture converted type has an upper bound InputStream from the original declaration
    }
}
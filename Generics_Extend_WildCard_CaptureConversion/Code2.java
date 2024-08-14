import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class Code2<E extends InputStream> {
    public void readFromIt(E readFrom) throws IOException{
        readFrom.read();
    }
    
    public static void main(String [] args) throws Exception{
        //The ce is passed only ? extends Serializable as a type argument. Hence the capture converted type has an upper
        //bound same as the original bound during the declaration, which is InputStream
        //Note that it is not possible to create an Object of wildcard type. That is a compile
        //time error
        
        //In this case even this is a compile time error. because the type argument must be both InputStream and Serializable
        Code2<? extends Serializable> ce=new Code2<InputStream>();
        
    }
}
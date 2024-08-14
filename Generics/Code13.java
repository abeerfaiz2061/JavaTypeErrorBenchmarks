import java.util.ArrayList;
import java.util.List;

class Cell<T> {
    private final T value;
    private static List<?> values = new ArrayList<?>(); 
    
    public Cell(T value) { 
      this.value=value; 
      values.add(value); 
    }
    public T getValue() { 
      return value; 
    }
    
    public static List<?> getValues() { 
      return values; 
    }
  }

    // Original Code Credits - https://github.com/hellojavaio/Java-Generics-and-Collections-2
package Generics_Extend_WildCard_CaptureConversion;
import java.util.ArrayList;
import java.util.List;

public class Code1<E, F extends E> {
    public void copy(List<E> to, List<? extends E> from) {
        for (F x : from) {
            to.add(x);
        }
    }
    
    public static void main(String[] args) {
        List<Object> aList = new ArrayList<>();
        List<String> copyFrom = new ArrayList<>();
        copyFrom.add("Hi");
        Code1<Object, String> ce = new Code1<>();
        ce.copy(aList, copyFrom);
        
        System.out.println(aList);
    }
}


// Original Code Credits - https://www.geekyarticles.com/2011/11/java-generics-capture-conversion.html
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




//Analysis of the Error
//Error location: The error is reported at the for loop where F x is used.
//Cause of the error: The type F cannot be directly assigned from ? extends E because the wildcard introduces a level of abstraction that the compiler cannot resolve to F.
//Better error location: Ideally, the error message should indicate that the issue arises due to the misuse of the wildcard in the method signature, but it instead points to the loop.
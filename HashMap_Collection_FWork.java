import java.util.HashMap;
import java.util.Map;

public class HashMap_Collection_FWork {
    public static void main(String[] args) {
        

        //Implementation of hashMap.
        Map<Integer,String> c = new HashMap<>() ;

        c.put(1,"A") ;
        c.put(2,"B") ;
        c.put(3,"C") ;
        c.put(10,"XYZ") ;
        System.out.println(c);
        

        //INsert only if the key is not present .
        c.putIfAbsent(3,"HelloWorld") ;
        c.putIfAbsent(4, "Hellooo WOrllldddd") ;// it will add 4 only not 3 because 3 is already present.
        System.out.println(c);

        c.put(3,"I am a Coder") ;// It will overRid the value.
        System.out.println(c);

        // Want to print only keys 
        for(Integer d:c.keySet()){
            System.out.print(d+" ");
        }
        System.out.println();
        //want to print only values.
        for(String d:c.values()){
            System.out.print(d+" ");
        }
    }
    
}

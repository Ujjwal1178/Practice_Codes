import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Collection_FWork{
    public static void main(String[] args) {
        
        Set<Integer> c = new LinkedHashSet<>() ;
        c.add(10) ;//add() function is used to insert the values in the set.
        c.add(50) ;
        c.add(100) ;
        c.add(60) ;
        System.out.println(c);

        //c.removeAll(c) ;// This will remove all the element from the set .
        //System.out.println(c);

        // remove() function is used to delete the element from the set.
        c.remove(50) ;// this will remove 50 from the set .
        System.out.println(c);


        // contains() will return the boolean value, it returns true if value is present else false .
        System.out.println( c.contains(60) );// returns true.

        //size() function will returns the size of set.
        System.out.println("Size is "+c.size());
        
        //clear() will clear our set.
        c.clear();
        System.out.println(c) ;

    }
}
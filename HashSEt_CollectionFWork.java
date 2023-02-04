import java.util.HashSet;
import java.util.Set;

public class HashSEt_CollectionFWork {
    
    public static void main(String[] args) {
        

        Set<Integer> c = new HashSet<>() ;
        c.add(10) ;//add() function is use to insert the values in the set 
        c.add(50) ;
        c.add(100) ;
        c.add(60) ;
        System.out.println(c); // It will give unordered set of data
      //  c.clear();// It will delete all the elements from the set .
        c.remove(50) ; // remove() function is used to delete the data from the hash set .
        System.out.println(c); 
        int d = c.size() ; // this will returns the size of the set .
        System.out.println("Size is "+d);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator{
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>() ;
        c.add(10) ;
        c.add(34) ;
        c.add(14) ;
        c.add(23) ;
        System.out.println(c);
        ListIterator<Integer> d = c.listIterator() ;
        while(d.hasNext()){ // traverse in forward direction.
            System.out.print(d.next()+" ");
        }
        // for traverse in backward direction we use
        System.out.println();
        while(d.hasPrevious()){
            System.out.print(d.previous()+" ");
        }
    }
}
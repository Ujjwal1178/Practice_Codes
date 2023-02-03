public class GCD {
    public static void main(String[] args) {
        int x = 40 ; 
        int y = 48 ;
        int min = x < y ?x:y ;
        while(min >0){
            if(x%min ==0 && y % min == 0){
                System.out.println("GCD :- "+min);
                return ;
            }
        }
        min-- ;
    }
    
}

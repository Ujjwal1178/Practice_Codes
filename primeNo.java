import java.util.* ;
public class primeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number :- ");
        int no = sc.nextInt() ;
        boolean flag = true ;
        if(no == 1 || no == 0){
            System.out.println("Its Not a prime no.");
        }
        for(int i =2 ; i < Math.sqrt(no) ; i++){
            if(no%i == 0){
                flag = false ;
            }
        }
        if(flag == false){
            System.out.println("Its not a prime no.");
        }else{
            System.out.println("Its a prime no");
        }
    }
}

import java.util.* ;
public class divisible_by_Its_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number :- ");
        int no = sc.nextInt() ;
        int num = no ;
        int sum = 0;
        
        while(no != 0 ){
            int rem = no%10 ;
            sum = sum + rem ;
            no = no/10 ;
        }
        if(num%sum == 0){
            System.out.println(num+" Yes");
        }else{
            System.out.println(num+" No");
        }
    }
    
}

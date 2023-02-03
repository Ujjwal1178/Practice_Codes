//Find out LCM and GCD of a Number
import java.util.* ;
public class LCM_GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the 1st no :- ");
        int no1 = sc.nextInt() ;
        System.out.print("Enter the 2nd no :- ");
        int no2 = sc.nextInt() ;
        int num1 = no1 ;
        int num2 = no2 ;
        int GCD = 0 ;
        while(no1%no2 != 0){
            GCD = no1%no2 ;
            no1 = no2 ;
            no2 = GCD ; 
        }
        System.out.println("GCD is "+GCD);
        int LCM = (num1*num2)/GCD ;
        System.out.println("LCM is "+LCM);


    }
}
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your number :- ");
        int number = sc.nextInt() ;
        int num = number ;
        int num1 = number ;
        int flag = 0 ;
        double sum = 0 ;
        while(number != 0 ){
            number = number/10 ;
            flag = flag+1 ;
        }
        System.out.println(num+" has "+flag+" no of digits ");
        while(num != 0) {
            int s = num%10 ;
            num = num/10 ;
            sum = sum + Math.pow(s, flag) ;

        }
        int sum1 = (int)sum ;
        if(sum1 == num1){
            System.out.println(num1+ " is an Armstrong number.");
        }else{
            System.out.println(num1+ " is not an Armstrong number.");
        }
    }
    
}

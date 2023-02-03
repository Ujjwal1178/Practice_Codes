import java.util.* ;
public class seeded_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number1 :- ");
        int no1 = sc.nextInt() ;
        System.out.print("Enter the number2 :- ");
        int no2 = sc.nextInt() ;
        int num2 = no1 ;
        int num = no1 ;
        while(no1 != 0){
            int reaminder = no1%10 ;
            num = num*reaminder ;
            no1 = no1/10 ;
        }
        if(num == no2){
            System.out.println(num2+" is seed of number of "+no2);
            
        }else{
            System.out.println(num2+" is not seed of number of "+no2);
           
        }  
    }
}

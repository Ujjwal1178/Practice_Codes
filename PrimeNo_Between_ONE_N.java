import java.util.Scanner;

public class PrimeNo_Between_ONE_N {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter the limit :- ");
        int number = sc.nextInt() ;
        

        if(number == 1 || number == 0){
            System.out.println("There is no prime no exixt.");
            return ;
        }
        System.out.println("Prime numbers are :- ");
        for(int i = 2 ; i <= number ; i++){
            int flag = 0 ;
            for(int j = i ; j >= 2 ; j--){
                if(i%j == 0){
                    flag = flag+1 ;
                }
            }
            if(flag == 1){
                System.out.print(i+" ");
            }
        }
    }
    
}

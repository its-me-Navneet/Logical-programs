import java.util.Scanner;

public class ReverseNo {
    
    public static void main(String[] args) {
        
        System.out.println("Enter number");
         Scanner sc =new Scanner(System.in) ;
        int N=sc.nextInt();
        sc.close(); 
        int n=N;
        int revNo=0 ;
         while(n>0){
             revNo = revNo*10 + n%10 ;
             n/=10 ;
         }
         System.out.println("Reverse no of "+ N + " is "+ revNo);
    }
}

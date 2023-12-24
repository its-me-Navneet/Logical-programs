import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        
        
        System.out.println("Enter number");
         Scanner sc =new Scanner(System.in) ;
        int n=sc.nextInt();
        sc.close(); 

        for(int i=2;i*i<=n;i++){
             if(n%i==0){
                 System.out.println("Non prime no");
                 return ;
             }
        }
        System.out.println("Prime no");
    }
}

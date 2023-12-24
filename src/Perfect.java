import java.util.Scanner;

public class Perfect {
    
    public static void main(String[] args) {
         
        System.out.println("Enter number");
         Scanner sc =new Scanner(System.in) ;
        int n=sc.nextInt();
        sc.close(); 

        int sum=1 ;
        for(int i=2;i*i<=n;i++){

             if(n%i==0){
                 sum+=i ;
                  if(n/i != i){
                    sum += (n/i) ;
                  }
             }
        }
        if(sum == n){
             System.out.println("given no is Perfect no");
        }
        else{
            System.out.println("Given no is not perfect no");
        }
    }
}

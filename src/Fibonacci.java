import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
       

        System.out.println("Enter number");
         Scanner sc =new Scanner(System.in) ;
        int n=sc.nextInt();
        sc.close();
        if(n==1){
             System.out.println(0);
             return ;
        }
         if(n==2){
             System.out.println(1);
             return ;
        }

        int last =1 ;
        int secondLast=0 ;
        int curr=0 ;
        for(int i=2;i<=n;i++){
              curr=last+secondLast ;
              secondLast=last ;
              last=curr ;
        }

        System.out.println(curr);


    }
}

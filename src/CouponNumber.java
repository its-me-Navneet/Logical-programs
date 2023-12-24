import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    public static void main(String[] args) {
        
        
        System.out.println("Enter number");
         Scanner sc =new Scanner(System.in) ;
        int n=sc.nextInt();
        sc.close();  

        HashSet<Integer> numbers = new HashSet<>() ;
       Random random = new Random() ;
        int ans=0 ;
        while(numbers.size() != n){
            ans++;
            int currNumber= random.nextInt(n)+1; 
            numbers.add(currNumber) ;
        }
        System.out.println("To get all random from 1 to N is "+ ans);


    }
}
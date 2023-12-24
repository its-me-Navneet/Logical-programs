import java.util.Scanner;

public class Stopwatch 
{
		
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
        long start=0 ;
        long end=0 ;
        double elapsedTime;
        System.out.println("Type any character to start the stopwatch");
        sc.next().charAt(0);

        start=System.currentTimeMillis();
        System.out.println("Type any character to stop the stopwatch");
        sc.next().charAt(0);

        end=System.currentTimeMillis();

        elapsedTime=(end-start)/1000.0;
        System.out.println("Time elapsed is  "+elapsedTime);
        sc.close();
		

	}
}
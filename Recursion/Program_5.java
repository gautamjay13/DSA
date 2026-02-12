import java.util.Scanner;

public class Program_5 {
     public static int power (int a, int b)
    {
        if (b==0) {
           return 1 ; 
        }
       return a * power(a, b-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your base ");
        int a=sc.nextInt() ;
        System.out.println("enter your power ");
        int b=sc.nextInt() ;
        System.out.println(a +  " raise to the power " +b + " is " + power(a,b) );
        
    }
} 
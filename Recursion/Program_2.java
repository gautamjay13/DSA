import java.util.Scanner;

public class Program_2 {
    public static void print (int n)
    {
        if (n==0) {
           return ; 
        }
        System.out.print (n+" ");
        print(n-1) ;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
       
        int n=sc.nextInt() ;
        
        print(n) ;
    }
}

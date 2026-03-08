package Recursion;

import java.util.Scanner;

public class Program_1 {
     public static int fact(int n) 
     {
        if (n==1) {    // base case 
            return 1;
        }
        int ans = n * fact(n-1);
        return ans ;  // recursive call 
     }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println( "Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println( "Factorial of " + n + " is: " + fact(n) );


    }
}

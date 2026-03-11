import java.util.Scanner;

public class intintostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt() ;
        String s = "" ;
        s+=n ; 
        String h  = Integer.toString(n) ;
        System.out.println(h);
        System.out.println(s);
        System.out.println(s.length());
    }
}


import java.util.*;

public class asdjkf {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n =A.length() ;
        int m =B.length() ;
        System.out.println(n+m);
        System.out.println(A.compareTo(B));
         A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(A + " " + B);
        sc.close();
        }
    }


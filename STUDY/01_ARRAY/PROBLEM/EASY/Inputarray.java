import java.util.Scanner;

public class Inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr [] = new int [n] ;
        //input
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt() ; 
        }
        System.out.println();
        //
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

import java.util.Scanner;

public class basic_200 {
 public static void main(String[] args) {
    // 10 20 30
    // 40 50 60
     // input of 2 d arrays 

     Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    //otuput of arrays   
    for (int i = 0; i <2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
    sc.close();
     
 }
}
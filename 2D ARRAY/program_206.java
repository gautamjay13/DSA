import java.util.Scanner;

public class program_206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rollno: ");
        int rollno = sc.nextInt();

        System.out.print("Enter number of marks: ");
        int marks = sc.nextInt();

        int[][] arr = new int[rollno][marks];

        System.out.println("Enter elements:");

        for (int i = 0; i < rollno; i++) {
            for (int j = 0; j < marks; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < rollno; i++) {
            for (int j = 0; j < marks; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

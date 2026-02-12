public class initilisation_202 {
    public static void main(String[] args) {

        // 2D Array Initialization
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Printing the 2D Array
        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class program_214 {
    public static void print2DArray(int[][] arr) {
        int n = arr.length ;
        int m = arr[0].length ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        print2DArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];  
                array[j][i] = temp;
            }
        }
        print2DArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
           int a = 0; int b = array.length - 1;
              while (a < b) {
                int temp = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = temp;
                a++;
                b--;
              }
        
        }
        print2DArray(array);
        
        

    }
}

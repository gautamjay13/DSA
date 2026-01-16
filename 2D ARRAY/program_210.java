public class program_210 {
    public static void main(String[] args) {
      int[][] arr = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
      int[][] arr1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
      int [][] result = new int[3][3] ;
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr[i][j] +arr1[i][j] ;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] +" "); 
            }
            System.out.println();
        }
    }
}

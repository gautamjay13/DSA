public class program_212 {
    public static void main(String[] args) {
        //rowise prinitng 
       int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}}; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] +" "); 
            }
            System.out.println();
        }
        System.out.println();
        
        //coloumwise printing 
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr[i][j] +" "); 
            }
            System.out.println();

            
        }
    }
}

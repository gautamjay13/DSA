

public class program_208 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}} ;
        int mx = Integer.MIN_VALUE ;
        int m = arr.length ;
        int n= arr[0].length ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, arr[i][j]) ;
            }
        }
        System.out.println("Your Maximun No is : "+mx);
         // sum of 2 - matrix 
         int sum = 0 ;
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              sum = sum + arr[1][j] ;  
            }
        }
        System.out.println("Your Sum Is : "+sum);
    }
}

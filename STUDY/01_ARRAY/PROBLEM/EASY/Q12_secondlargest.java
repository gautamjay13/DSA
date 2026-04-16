public class Q12_secondlargest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9} ;
        int max = Integer.MIN_VALUE ;
        int secmax = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                secmax = max ; 
                max = arr[i] ;}
                else if (arr[i] > secmax && arr[i] != max){
                    secmax = arr[i] ;
                }
                System.out.println(secmax);
            }
            
        }
        
    }


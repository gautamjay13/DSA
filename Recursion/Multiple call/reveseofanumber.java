public class reveseofanumber {
    public static void reverse(int n , int r )
    {   
        if ( n==0)
        {
            System.out.println(r);
            return ;
        }
        reverse(n/10, r*10+ n% 10) ;

    }
    public static void main(String[] args) {
        int n = 2456 ;
        reverse(n, 0) ;
    }
}

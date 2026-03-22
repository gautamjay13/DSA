public interface append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.append(35) ;
        System.out.println(s);
        s.append("#") ;
        System.out.println(s);

    }
}

public class Pg44 {
    public static void main(String[] args) {
        int rev=0;
        int n=10899;
        while(n>0){
            int LastDigit=n%10;
            rev=(rev*10)+LastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}

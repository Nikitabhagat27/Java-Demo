public class Pg43 {
    public static void main(String[] args) {
        //Last digit num%10 nikalna hai to
        //remove last digit num/10
        int n=10899;
        while(n>0){
            int lastDigit= n%10;
            System.out.print(lastDigit);
            n= n/10;//n/=10
        }
        System.out.println();
    }
}

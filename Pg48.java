import java.util.Scanner;
public class Pg48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
        }
        System.out.println(n);
    }while(true);
}
}
// 10  se divide hai number to break ho jayega statement
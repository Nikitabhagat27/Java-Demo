import java.util.Scanner;
public class Pg53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        int fact=1;
        num=sc.nextInt();
        System.out.println("inter any posetive integer");
        for(int i=0; i<=1; i++){
            fact *=i;
        }
        System.out.println("fectorial:  "+ fact);
    }
}

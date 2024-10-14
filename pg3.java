import java.util.Scanner;
public class pg3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc. nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        int product= a*b;
        System.out.println(product);
        int divide=a/b;
        System.out.println(divide);
        double rad=sc.nextDouble();
        double area = 3.14 * rad * rad;
        System.out.println(area);
        float red=sc.nextFloat();
        float areaa=3.14f* red*red;
        System.out.println(areaa);
    }
}

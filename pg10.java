import java.util.Scanner;
public class pg10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte b=4;
        char c='a';
        short s= 512;
        int i=1000;
        float f= 314f;
        double d=99.9954;
         double result=(f*b)+(i%c)-(d*s);
        System.out.println(result);
        //double type because of type conversion

    }
}

import java.util.Scanner;
public class pg4 {
    //type conversion in java
    // byte=>short=>int=>float=>long=>double
    //lossy conversion= data lost hota hai
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int number=sc.nextFloat();
        float number=sc.nextInt();

     int a= 25;
     long b= a;
        System.out.println(b);
        byte c=90;
        short d= c;
        System.out.println(d);
        short h=78;
        int k=h;
        System.out.println(k);
        //long ke anadar float data store nhi ho skta lossy conversation ho jayega.
        float l=6;
        double o=l;
        System.out.println(o);



    }
}

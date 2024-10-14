import java.util.Scanner;
public class pg9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float ereaser=sc.nextFloat();
        float total =pencil+pen+ereaser;
        System.out.println("Bill is:"+total);
        //Add on with 18% GST
        float newTotal= total + (0.18f * total);
        System.out.println("Total Bill:"+newTotal);




    }
}

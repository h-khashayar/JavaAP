import java.util.Scanner;

/**
 * Created by asus on 13-May-20.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        float a=scanner.nextFloat();
        System.out.println("Enter b:");
        float b=scanner.nextFloat();
        Action action=new Action();
        action.a=a;
        action.b=b;
        System.out.println("a+b= "+ action.add());
        System.out.println("a-b= "+ action.subtract());
        System.out.println("a*b= "+ action.multiply());
        System.out.println("a/b= "+ action.divide());
    }
}

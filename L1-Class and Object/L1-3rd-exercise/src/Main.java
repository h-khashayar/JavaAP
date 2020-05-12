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
        System.out.println("Enter c:");
        float c=scanner.nextFloat();
        System.out.println("Enter d:");
        float d=scanner.nextFloat();
        System.out.println("Enter e:");
        float e=scanner.nextFloat();
        System.out.println("Enter f:");
        float f=scanner.nextFloat();
        Equation equation=new Equation(a,b,c,d,e,f);
        equation.solve();
    }
}

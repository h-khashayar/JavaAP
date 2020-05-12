import java.util.Scanner;

/**
 * Created by asus on 13-May-20.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= scanner.nextInt();
        MyIntegerClass myIntegerClass=new MyIntegerClass();
        myIntegerClass.a=n;
        myIntegerClass.isZero();
        myIntegerClass.isPositive();
        myIntegerClass.isNegative();
        myIntegerClass.isOdd();
        myIntegerClass.isEven();
    }
}

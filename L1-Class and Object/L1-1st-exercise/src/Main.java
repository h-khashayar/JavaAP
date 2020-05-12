import java.util.Scanner;

/**
 * Created by asus on 12-May-20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Rectangle's width:");
        Scanner scanner=new Scanner(System.in);
        int w=scanner.nextInt();
        System.out.println("Enter Rectangle's length:");
        int l=scanner.nextInt();
        Rectangle rectangle=new Rectangle(w,l);
        rectangle.perimeter();
        rectangle.area();
        System.out.println("Enter Square's width:");
        int ww=scanner.nextInt();
        Square square= new Square(ww);
        square.perimeter();
        square.area();
    }
}

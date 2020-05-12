import java.util.Scanner;

/**
 * Created by asus on 12-May-20.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many subjects did you have?");
        int n=scanner.nextInt();
        Student student=new Student(n);
        student.avg();
    }
}

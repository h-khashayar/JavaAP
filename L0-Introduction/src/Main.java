import java.util.Scanner;

/**
 * Created by asus on 12-May-20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length:");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the digits:");
        int i;
        for(i=0;i<n;i++){
          a[i]= scanner.nextInt();
        }
        System.out.println("Enter your intended digit:");
        int x=scanner.nextInt();
        int j=0;
        for (i=0;i<n;i++){
            if(x==a[i]){
                j++;
            }
        }
        if(j==0){
            System.out.println("Digit couldn't be found!!! FALSE!!!!");
        }
        else{
            System.out.println("Found the digit "+j+" times!!!TRUE!!!!");
        }
    }
}

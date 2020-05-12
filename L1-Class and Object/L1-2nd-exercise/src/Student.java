import java.util.Scanner;

/**
 * Created by asus on 12-May-20.
 */
public class Student {
    Scanner scanner=new Scanner(System.in);
    public int n;

    public Student(int n){
        this.n=n;
    }
    public void avg()
    {
        float[] mark=new float[n];
        String[] name= new String[n];
        int[] factor= new int[n];
        int i;
        for (i=0;i<n;i++){
            System.out.println("Enter subject's name:");
            name[i]=scanner.nextLine();
            System.out.println("Enter subject's factor:");
            factor[i]=scanner.nextInt();
            System.out.println("Enter your mark:");
            mark[i]=scanner.nextFloat();
            scanner.nextLine();
        }

        float sum=0;
        int sumfac=0;
        for (i=0;i<n;i++){
            sum= (mark[i]*factor[i])+sum;
            sumfac= factor[i]+sumfac;
        }
        float average=sum/sumfac;
        if(average<12){
            System.out.println("Your average is "+ average +" and you have conditonal passed");
        }
        else{
            System.out.println("Your average is "+ average +" and you have passed unconditionally");
        }
    }
}

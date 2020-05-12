/**
 * Created by asus on 13-May-20.
 */
public class MyIntegerClass implements MyInteger {
    public int a;
    @Override
    public void isZero() {
        if(a==0){
            System.out.println("Zero");
        }
    }
    @Override
    public void isPositive() {
        if(a>0){
            System.out.println("Positive");
        }
    }

    @Override
    public void isNegative() {
        if(a<0){
            System.out.println("Negative");
        }
    }
    public void isOdd(){
        if(a%2!=0){
            System.out.println("Odd");
        }
    }

    @Override
    public void isEven() {
        if(a%2==0){
            System.out.println("Even");
        }
    }
}

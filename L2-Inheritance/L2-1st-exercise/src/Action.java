/**
 * Created by asus on 13-May-20.
 */
public class Action implements Add,Subtract,Multiply,Divide {
    public float a;
    public float b;
    @Override
    public float add() {
        return (a+b);
    }

    @Override
    public float subtract() {
        return (a-b);
    }

    @Override
    public float multiply() {
        return (a*b);
    }

    @Override
    public float divide() {
        return (a/b);
    }
}

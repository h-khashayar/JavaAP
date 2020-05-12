/**
 * Created by asus on 13-May-20.
 */
public class Equation {
    public float a,b,c,d,e,f;
    public Equation(float a,float b,float c,float d,float e,float f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public void solve(){
        if((a*d==b*c)&&(a/c==e/f)){
            System.out.println("This Equation has infinite answers");
        }
        else if((a*d==b*c)&&(a/c!=e/f)){
            System.out.println("The Equation is WRONG and can't be solved");
        }
        else{
            System.out.println("x is:"+(( (e*d) - (b*f) ) / ( (a*d) - (b*c) )));
            System.out.println("y is:"+(( (a*f) - (e*c) ) / ( (a*d) - (b*c) )));
        }
    }
}

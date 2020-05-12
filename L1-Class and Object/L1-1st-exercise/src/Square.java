/**
 * Created by asus on 12-May-20.
 */
public class Square {
    public int width;
    public Square( int width) {
        this.width = width;
    }
    public void perimeter(){
        System.out.println("Square's perimeter is: "+ 4*this.width);
    }
    public void area(){
        System.out.println("Square's area is: "+ (this.width * this.width));
    }
}

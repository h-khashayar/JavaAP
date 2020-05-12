/**
 * Created by asus on 12-May-20.
 */
public class Rectangle {
    public int width;
    public int length;
    public Rectangle( int width, int length) {
        this.width = width;
        this.length = length;
    }
    public void perimeter(){
        System.out.println("Rectangle's perimeter is: "+ 2*(this.width + this.length));
    }
    public void area(){
        System.out.println("Rectangle's area is: "+ (this.length * this.width));
    }
}

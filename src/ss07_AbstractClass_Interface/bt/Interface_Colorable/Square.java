package ss07_AbstractClass_Interface.bt.Interface_Colorable;
import ss07_AbstractClass_Interface.bt.Interface_Colorable.Shape;

public class Square extends Shape implements Colorable {
    private double size=1.0;

    public Square(){
    }
    public Square(double size){
        this.size=size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea() {
        return size*size;
    }

    public double getPerimeter() {
        return 4*size;
    }


    @Override
    public String toString() {
        return "Square: " +
                "size=" + size
                + ", which is a subclass of "
                + super.toString();
    }


    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}

package ss07_AbstractClass_Interface.bt.Interface_Resizeable;

public class Square extends Shape implements Resizeable{
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
    public void resize(double percent) {
        double random= Math.random()*((percent-1)+1)+1;
        double pcent=this.getSize()/100*random;
        this.setSize(this.getSize()+pcent);
    }
}

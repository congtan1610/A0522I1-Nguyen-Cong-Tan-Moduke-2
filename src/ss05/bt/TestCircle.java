package ss05.bt;

import java.util.SplittableRandom;

class Circle{
    private double radius=1.0;
    private String color="red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){      //thay private thì không sd được phương thức còn lại sd được
        return this.radius;
    }
    public double getArea(){
        return this.radius*3.14;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle Circle= new Circle(2);
        System.out.printf("radius: "+Circle.getRadius()+", area: "+Circle.getArea());
    }
}

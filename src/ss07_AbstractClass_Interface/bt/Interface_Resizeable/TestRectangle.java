package ss07_AbstractClass_Interface.bt.Interface_Resizeable;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[2];
        rectangles[0]=new Rectangle(2,4);
        rectangles[1]=new Rectangle(2,5);
        for (Rectangle x:rectangles) {
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+", chu vi: "+x.getPerimeter());
        }
        for (Rectangle x:rectangles) {
            x.resize(100);
        }
        System.out.println("change:");
        for (Rectangle x:rectangles) {
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+", chu vi: "+x.getPerimeter());
        }
    }
}

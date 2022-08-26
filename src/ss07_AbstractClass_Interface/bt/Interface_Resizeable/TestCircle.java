package ss07_AbstractClass_Interface.bt.Interface_Resizeable;

public class TestCircle {
    public static void main(String[] args) {
        Circle[] circles=new Circle[2];
        circles[0]=new Circle(10);
        circles[1]=new Circle(20);
        for (Circle x:circles){
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+", chu vi: "+x.getPerimeter());
        }
        for (Circle x:circles) {
            x.resize(100);
        }
        System.out.println("change:");
        for (Circle x:circles){
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+", chu vi: "+x.getPerimeter());
        }
    }
}

package ss07_AbstractClass_Interface.bt.Interface_Resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square[] square=new Square[2];
        square[0]=new Square(3);
        square[1]=new Square(5);
        for (Square x:square) {
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+"chu vi: "+x.getPerimeter());
        }
        square[0].resize(100);
        square[1].resize(100);
        System.out.println("change:");
        for (Square x:square) {
            System.out.println(x);
            System.out.println("dien tich: "+x.getArea()+", chu vi: "+x.getPerimeter());
        }
    }
}

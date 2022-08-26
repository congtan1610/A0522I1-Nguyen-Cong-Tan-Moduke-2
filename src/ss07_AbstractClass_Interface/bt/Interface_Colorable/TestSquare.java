package ss07_AbstractClass_Interface.bt.Interface_Colorable;
public class TestSquare {
    public static void main(String[] args) {
        Square[] squares=new Square[2];
        squares[0]=new Square("blue",false,5);
        squares[1]=new Square("red",true,6);
        for(Square x:squares){
            if (x.isFilled()){
                System.out.print(x);
                System.out.println(" =>"+x.howToColor());
            }else {
                System.out.println(x);
            }
        }
    }
}

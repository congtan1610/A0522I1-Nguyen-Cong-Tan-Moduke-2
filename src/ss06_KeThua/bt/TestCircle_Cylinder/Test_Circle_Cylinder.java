package ss06_KeThua.bt.TestCircle_Cylinder;

public class Test_Circle_Cylinder {
    public static void main(String[] args) {
        Circle Circle=new Circle(10,"red");
        System.out.printf(""+Circle+", area= "+Circle.area()+"\n");
        Cylinder Cylinder=new Cylinder(20,"blue",10);
        System.out.printf(""+Cylinder+", volume= "+Cylinder.volume());
    }
}

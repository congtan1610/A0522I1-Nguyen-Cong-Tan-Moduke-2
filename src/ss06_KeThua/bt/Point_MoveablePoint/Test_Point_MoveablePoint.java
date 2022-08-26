package ss06_KeThua.bt.Point_MoveablePoint;

public class Test_Point_MoveablePoint {
    public static void main(String[] args) {
        Point Point=new Point(2,3);
        MoveablePoint MPoint=new MoveablePoint(2,5,2,4);
        System.out.println("point: "+Point);
        MPoint.move();
        System.out.println("move point: "+MPoint);
    }
}
//chwa xong

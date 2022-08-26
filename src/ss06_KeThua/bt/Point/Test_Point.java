package ss06_KeThua.bt.Point;

public class Test_Point {
    public static void main(String[] args) {
        Point2D Point2D=new Point2D(2,3);
        Point3D Point3D=new Point3D(3,4,5);
        for (float x:Point2D.getXY()) {
            System.out.printf(""+x+", ");
        }
        System.out.println("\nPoint2D: "+Point2D);
        for (float x:Point3D.getXYZ()) {
            System.out.printf(""+x+", ");
        }
        System.out.println("\nPoint3D: "+Point3D);
    }
}

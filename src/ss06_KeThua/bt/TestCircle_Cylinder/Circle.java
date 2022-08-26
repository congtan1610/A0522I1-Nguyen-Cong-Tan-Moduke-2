package ss06_KeThua.bt.TestCircle_Cylinder;

public class Circle {
    private double radius;
    private String color;
    final double pi = 3.14;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPi() {
        return pi;
    }

    public double area() {
        return Math.pow(this.radius, 2) * this.pi;
    }

    @Override
    public String toString() {
        return "Circle:\n" +
                "radius=" + radius +
                ", color=" + color;
    }
}

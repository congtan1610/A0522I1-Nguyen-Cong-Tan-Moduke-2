package ss04_LopVaDoiTuongTrongJava.baitap;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public Fan(){
    }
    public void ToString(){
        if (this.on){
            System.out.printf("speed: "+this.speed+", color: "+this.color+", radius: "+this.radius+", fan is on");
        }else {
            System.out.printf("color: "+this.color+", radius: "+this.radius+", fan is off");
        }
    }
}
 class MainFan{
    public static void main(String[] args) {
        Fan Fan1=new Fan();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        Fan Fan2=new Fan();
        Fan2.setSpeed(Fan1.MEDIUM);
        Fan2.setRadius(5);
        System.out.print("Fan1: ");
        Fan1.ToString();
        System.out.print("\nFan2: ");
        Fan2.ToString();
    }
}

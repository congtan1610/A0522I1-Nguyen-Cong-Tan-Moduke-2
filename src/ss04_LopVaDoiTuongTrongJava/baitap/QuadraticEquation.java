package ss04_LopVaDoiTuongTrongJava.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }
}

class MainQua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eter a, b, c:");
        double a = input.nextDouble();
//        System.out.print("Eter b:");
        double b = input.nextDouble();
        //System.out.print("Eter c:");
        double c = input.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        if (pt.getDiscriminant() < 0) {
            System.out.print("The equation has not real roots!");
        } else if (pt.getDiscriminant() > 0) {
            System.out.printf("The equation has two root " + pt.getRoot1() + " and " + pt.getRoot2());
        } else {
            System.out.printf("The equation has  one root " + (-b / (2 * a)));
        }
    }
}

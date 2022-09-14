package ss15_Exception_Debug.bt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("Enter b:");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Enter c:");
        double c = Double.parseDouble(input.nextLine());
        try {
            check(a, b, c);
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void check(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InputMismatchException();
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new ArithmeticException();
        }
    }
}

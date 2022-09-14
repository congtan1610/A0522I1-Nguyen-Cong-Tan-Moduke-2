package ss15_Exception_Debug.bt;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("Enter b:");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Enter c:");
        double c = Double.parseDouble(input.nextLine());
        try{
            check(a,b,c);
            System.out.println("ok");
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }

    private static void check(double a, double b, double c) throws IllegalTriangleException{
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" cạnh nhập vào bé hơn hoặc bằng 0");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("tổng hai cạnh bất kì bé hơn cạnh còn lại");
        }
    }
}

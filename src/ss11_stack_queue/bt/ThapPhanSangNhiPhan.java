package ss11_stack_queue.bt;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<Integer>();
        System.out.print("Nhập số: ");
        int num = Integer.parseInt(input.nextLine());
        while (num != 0)
        {
            int d = num % 2;
            myStack.push(d);
            num /= 2;
        }
        System.out.print(num+" sang nhị phân là: ");
        while (!(myStack.isEmpty() ))
        {
            System.out.print(myStack.pop());
        }
    }
}

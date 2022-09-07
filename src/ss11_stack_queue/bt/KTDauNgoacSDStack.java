package ss11_stack_queue.bt;

import java.util.Scanner;
import java.util.Stack;

public class KTDauNgoacSDStack {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập biểu thức:");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push('(');
            }
        }
        if (bStack.isEmpty()) {
            System.out.println("false");
        }else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ')') {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println(bStack);
    }
}

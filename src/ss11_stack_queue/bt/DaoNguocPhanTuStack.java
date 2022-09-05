package ss11_stack_queue.bt;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //đảo ngược số nguyên

//        Stack<Integer> arr = new Stack<>();
//        Stack<Integer> arrOut = new Stack<>();
//        System.out.print("Enter your size:");
//        int size=input.nextInt();
//        for (int i=0;i<size;i++){
//            System.out.print("Enter arr["+i+"]:");
//            arr.push(input.nextInt());
//        }
//
//        System.out.println(arr);
//        for (int i=0;i<size;i++){
//           arrOut.push(arr.pop());
//        }
//        System.out.println(arrOut);

        //đảo ngược chuỗi

        Stack<String> wStack = new Stack<>();
        Stack<String> arrStrOut = new Stack<>();
        System.out.print("Nhập chuỗi:");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            wStack.push(String.valueOf(str.charAt(i)));
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += wStack.pop();
        }
        System.out.println("Chuỗi sau khi đảo:"+newStr);
    }
}

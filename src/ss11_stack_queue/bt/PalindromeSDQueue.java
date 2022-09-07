package ss11_stack_queue.bt;

import java.util.*;

public class PalindromeSDQueue {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập chuỗi:");
        String str1=input.nextLine();
        String str=str1.toLowerCase();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }
        boolean flag=true;
        for (int i=0;i<str.length();i++){
            if (stack.pop()!=queue.poll()){
                System.out.println("Chuỗi vừa nhập không phải palindrome");
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Chuỗi vừa nhập là palindrome");
        }
    }
}

package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng:");
        int size=input.nextInt();
        int[] arr=new int[size];
        for (int index=0; index<arr.length;index++){
            System.out.print("Nhập phần tử arr["+index+"]:");
            arr[index]=input.nextInt();
        }
        int min=arr[0];
        for (int index=1; index<arr.length;index++){
            if (min>arr[index]){
                min=arr[index];
            }
        }
        System.out.printf("Mảng vừa nhập là: ");
        for (int index=0; index<arr.length;index++){
            System.out.print(""+arr[index]+",");
        }
        System.out.print("\nGiá trị nhỏ nhất tronng mảng là: "+min);
    }
}

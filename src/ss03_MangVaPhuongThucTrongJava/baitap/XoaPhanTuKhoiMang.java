package ss03_MangVaPhuongThucTrongJava.baitap;

import java.sql.Array;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,7,8,9};
        System.out.printf("Mảng trước khi xóa:");
        for (int i=0;i<arr.length;i++){
            System.out.printf(" "+arr[i]+",");
        }
        Scanner input=new Scanner(System.in);
        System.out.printf("\nNhập phần tử cần xóa: ");
        int del=input.nextInt();
        for (int i=0;i<arr.length;i++){
            if (del==arr[i]){
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
            }
        }
        System.out.printf("Mảng sau khi xóa:");
        for (int i=0;i<arr.length;i++){
            System.out.printf(" "+arr[i]+",");
        }
    }
}

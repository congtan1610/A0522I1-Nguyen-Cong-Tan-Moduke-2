package ss03_MangVaPhuongThucTrongJava.baitap;

import java.sql.Array;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int a = arr.length + 1;
        int[] newarr = new int[a];
        Scanner input = new Scanner(System.in);
        System.out.printf("Mảng trước khi chèn:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" " + arr[i] + ",");
        }
        System.out.printf("\nNhập số cần chèn:");
        int X = input.nextInt();
        System.out.printf("Nhập vị trí chèn:");
        int Index = input.nextInt();
        if (Index<=1||Index>=newarr.length-1){
            System.out.println("không chèn được");
        }else{
            for (int i = 0; i < newarr.length - 1; i++) {
                newarr[i] = arr[i];
            }
            newarr[newarr.length - 1] = 0;
            for (int i = 0; i < newarr.length; i++) {
                if (Index == i) {
                    for (int j = newarr.length - 1; j > i; j--) {
                        newarr[j] = newarr[j - 1];
                    }
                    newarr[i] = X;
                }
            }
            System.out.printf("Mảng sau khi chèn:");
            for (int i = 0; i < newarr.length; i++) {
                System.out.printf(" " + newarr[i] + ",");
            }
        }
    }
}

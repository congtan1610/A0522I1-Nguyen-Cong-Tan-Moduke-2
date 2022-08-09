package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[4];
        int[] arr3=new int[(arr1.length+arr2.length)];
        System.out.println("Mảng 1 ( 5 phần tử )");
        for (int index1=0;index1<arr1.length;index1++){
            System.out.printf("Nhập phần tử arr1["+index1+"]:");
            arr1[index1]=input.nextInt();
        }
        System.out.println("Mảng 2 ( 5 phần tử )");
        for (int index2=0;index2<arr2.length;index2++){
            System.out.printf("Nhập phần tử arr2["+index2+"]:");
            arr2[index2]=input.nextInt();
        }
        System.out.printf("Mảng 1:");
        for (int index1 = 0; index1 < arr1.length; index1++) {
            System.out.printf(" " + arr1[index1] + ",");
        }
        System.out.printf("\nMảng 2:");
        for (int index2 = 0; index2 < arr2.length; index2++) {
            System.out.printf(" " + arr2[index2] + ",");
        }
        for(int index3=0;index3< arr1.length;index3++){
            arr3[index3]=arr1[index3];
        }
        for(int index3=arr1.length;index3< arr3.length;index3++){
            arr3[index3]=arr2[index3- arr1.length];
        }
        System.out.printf("\nMảng sau khi gộp:");
        for (int index3 = 0; index3 < arr3.length; index3++) {
            System.out.printf(" " + arr3[index3] + ",");
        }
    }
}

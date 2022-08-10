package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotCoDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng:");
        int row = input.nextInt();
        System.out.print("Nhập số cột của ma mảng:");
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử arr[" + i + "][" + j + "]:");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("mảng vừa nhập là:\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("" + arr[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        System.out.print("\nNhập cột muốn tính tổng:");
        int colIndex = input.nextInt();
        while (colIndex > col - 1 || colIndex < 0) {
            System.out.println("không có cột " + colIndex + " trong mảng");
            System.out.print("\nNhập cột muốn tính tổng:");
            colIndex = input.nextInt();
        }
        double sumCol = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sumCol += arr[i][colIndex];
        }
        System.out.println("Tổng các phần tử cột " + colIndex + " là: " + sumCol);
    }
}

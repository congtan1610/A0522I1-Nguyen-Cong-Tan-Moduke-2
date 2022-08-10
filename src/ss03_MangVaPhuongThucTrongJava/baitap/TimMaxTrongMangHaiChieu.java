package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class TimMaxTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận:");
        int row = input.nextInt();
        System.out.print("Nhập số cột của ma trận:");
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        for (int indexRow = 0; indexRow < arr.length; indexRow++) {
            for (int indexCol = 0; indexCol < arr[indexRow].length; indexCol++) {
                System.out.print("Nhập phần tử [" + (indexRow+1) + "][" + (indexCol+1) + "]:");
                arr[indexRow][indexCol] = input.nextDouble();
            }
        }
        System.out.println("Ma trận vừa nhập là:\n");
        for (int indexRow = 0; indexRow < arr.length; indexRow++) {
            for (int indexCol = 0; indexCol < arr[indexRow].length; indexCol++) {
                System.out.print("" + arr[indexRow][indexCol] + "\t");
            }
            System.out.printf("\n");
        }
        double max = arr[0][0];
        for (int indexRow = 0; indexRow < arr.length; indexRow++) {
            for (int indexCol = 0; indexCol < arr[indexRow].length; indexCol++) {
                if (max < arr[indexRow][indexCol]) {
                    max = arr[indexRow][indexCol];
                }
            }
        }
        String[] kq = new String[row * col];
        int sl = 0;
        for (int indexRow = 0; indexRow < arr.length; indexRow++) {
            for (int indexCol = 0; indexCol < arr[indexRow].length; indexCol++) {
                if (max == arr[indexRow][indexCol]) {
                    sl += 1;
                    kq[sl - 1] = "hàng " + (indexRow+1) + " & cột " + (indexCol+1);
                }
            }
        }
        System.out.print("\nGiá trị lớn nhất của ma trận là: " + max);
        if (sl == 1) {
            System.out.print("\nNằm ở tọa độ là: ");
            System.out.print("" + kq[0] + ",");
        } else {
            System.out.print("\nNằm ở " + sl + " tọa độ là: ");
            for (int index = 0; index < sl; index++) {
                System.out.print(" " + kq[index] + ";");
            }
        }
    }
}

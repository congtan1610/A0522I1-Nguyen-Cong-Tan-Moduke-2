package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class TongCacSoODuongCheoChinhCuaMaTran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước x của ma trận vuông(x*x):");
        int x = input.nextInt();
        double[][] arr = new double[x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử [" + (i+1) + "][" + (j+1) + "]:");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Ma trận vừa nhập là:\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("" + arr[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        double sum1=0.0;
        double sum2=0.0;
        for (int i = 0; i < arr.length; i++) {
                    sum1+=arr[i][i];
        }
        System.out.println("\nTổng các phần tử ở đường chéo chính là: "+sum1);
        for (int i = 0; i < arr.length; i++) {
                sum2+=arr[i][arr.length-1-i];
        }
        System.out.println("Tổng các phần tử ở đường chéo phụ là: "+sum2);
    }
}

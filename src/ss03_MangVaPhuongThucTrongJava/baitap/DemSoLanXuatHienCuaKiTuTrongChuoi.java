package ss03_MangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = input.nextLine();
        System.out.print("Nhập kí tự muốn đến: ");
        String  kt = input.next();
        System.out.printf("Chuỗi vừa nhập: " + str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            Character tmp=str.charAt(i);
            if (kt.equals(tmp.toString())) {
                count++;
            }
        }
        System.out.println("\nKí tự '" + kt + "' xuất hiện " + count + " lần");
    }
}

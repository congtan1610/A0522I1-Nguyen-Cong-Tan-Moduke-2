package bai_tap_them2.controller;

import bai_tap_them2.service.VehicleServiceImpl;

import java.util.Scanner;

public class VehicleController {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG--\n" +
                    "Chọn chức năng:\n" +
                    "1. Oto\n" +
                    "2. Xe tải\n" +
                    "3. Xe máy\n" +
                    "4. Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    OtoController otoController = new OtoController();
                    otoController.menuOto();
                    break;
                case 2:
                    XeTaiController xeTaiController = new XeTaiController();
                    xeTaiController.menuXeTai();
                    break;
                case 3:
                    XeMayController xeMayController = new XeMayController();
                    xeMayController.menuXeMay();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}

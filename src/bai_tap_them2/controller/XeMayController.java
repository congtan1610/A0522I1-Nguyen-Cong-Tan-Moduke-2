package bai_tap_them2.controller;

import bai_tap_them2.service.VehicleServiceImpl;

import java.util.Scanner;

public class XeMayController {
    private VehicleServiceImpl vehicleService = new VehicleServiceImpl();
    Scanner input = new Scanner(System.in);

    public void menuXeMay() {
        do {
            System.out.println("1. Thêm mới xe tải.\n" +
                    "2. Hiện thị xe máy.\n" +
                    "3. Xóa xe máy\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    vehicleService.addXeMay();
                    break;
                case 2:
                    vehicleService.findAllXeMay();
                    break;
                case 3:
                    vehicleService.removeXeMay();
                    break;
                case 4:
                    vehicleService.findByIdXeMay();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}

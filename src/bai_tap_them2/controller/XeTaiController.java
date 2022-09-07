package bai_tap_them2.controller;

import bai_tap_them2.service.VehicleServiceImpl;

import java.util.Scanner;

public class XeTaiController {
    private VehicleServiceImpl vehicleService = new VehicleServiceImpl();
    Scanner input = new Scanner(System.in);

    public void menuXeTai() {
        do {
            System.out.println("1. Thêm mới xe tải.\n" +
                    "2. Hiện thị xe tải\n" +
                    "3. Xóa xe tải\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    vehicleService.addXeTai();
                    break;
                case 2:
                    vehicleService.findAllXeTai();
                    break;
                case 3:
                    vehicleService.removeXeTai();
                    break;
                case 4:
                    vehicleService.findByIdXeTai();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}

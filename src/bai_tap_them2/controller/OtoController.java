package bai_tap_them2.controller;

import bai_tap_them2.service.VehicleServiceImpl;

import java.util.Scanner;

public class OtoController {
    private VehicleServiceImpl vehicleService = new VehicleServiceImpl();
    Scanner input = new Scanner(System.in);

    public void menuOto() {
        do {
            System.out.println("\n1. Thêm mới oto.\n" +
                    "2. Hiện thị oto\n" +
                    "3. Xóa oto\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    vehicleService.addOto();
                    break;
                case 2:
                    vehicleService.findAllOto();
                    break;
                case 3:
                    vehicleService.removeOto();
                    break;
                case 4:
                    vehicleService.findByIdOto();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}

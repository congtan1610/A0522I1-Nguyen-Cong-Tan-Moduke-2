package bt_them2.Controller;

import bt_them2.Service.VehicleService;

import java.util.Scanner;

public class MotorController {
    private VehicleService vehicleService = new VehicleService();

    void controller() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm mới xe máy.\n" +
                    "2. Hiện thị xe máy\n" +
                    "3. Xóa xe máy\n" +
                    "4. Tìm kiếm theo biển kiểm soát xe máy\n" +
                    "5. Thoát\n");
            System.out.print("Mời chọn:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    vehicleService.addMotor();
                    break;
                case 2:
                    vehicleService.findAllMotor();
                    break;
                case 3:
                    vehicleService.deleteMotor();
                    break;
                case 4:
                    vehicleService.findByIdMotor();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Không có chức năng vừa chọn--exit\n");
            }
        } while (true);
    }
}

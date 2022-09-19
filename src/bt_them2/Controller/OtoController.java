package bt_them2.Controller;

import bt_them2.Service.VehicleService;

import java.util.Scanner;

public class OtoController {
    private VehicleService vehicleService=new VehicleService();
    public void controller() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm mới oto.\n" +
                    "2. Hiện thị oto\n" +
                    "3. Xóa oto\n" +
                    "4. Tìm kiếm theo biển kiểm soát oto\n" +
                    "5. Thoát\n");
            System.out.print("Mời chọn:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    vehicleService.addOto();
                    break;
                case 2:
                    vehicleService.findAllOto();
                    break;
                case 3:
                    vehicleService.deleteOto();
                    break;
                case 4:
                    vehicleService.findByIdOto();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Không có chức năng vừa chọn--exit\n");
            }
        } while (true);
    }
}

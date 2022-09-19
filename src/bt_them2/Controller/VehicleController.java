package bt_them2.Controller;

import java.util.Scanner;

public class VehicleController {

    public static void main(String[] args) {
        OtoController otoController=new OtoController();
        TruckController truckController=new TruckController();
        MotorController motorController=new MotorController();
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("---CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG---\n" +
                    "Chọn phương tiện:\n" +
                    "1. Oto.\n" +
                    "2. Truck\n" +
                    "3. Motor\n" +
                    "4. Thoát\n");
            System.out.print("Mời chọn:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    otoController.controller();
                    break;
                case 2:
                    truckController.controller();
                    break;
                case 3:
                    motorController.controller();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("Không có chức năng vừa chọn--exit\n");
            }
        } while (true);
    }
}

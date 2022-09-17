package demo_mvc.Controller;

import java.util.Scanner;

public class TruckController {
    void controller(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm mới xe tải.\n" +
                    "2. Hiện thị xe tải\n" +
                    "3. Xóa xe tải\n" +
                    "4. Tìm kiếm theo biển kiểm soát xe tải\n" +
                    "5. Thoát\n");
            System.out.print("Mời chọn:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Không có chức năng vừa chọn--exit\n");
            }
        } while (true);
    }
}

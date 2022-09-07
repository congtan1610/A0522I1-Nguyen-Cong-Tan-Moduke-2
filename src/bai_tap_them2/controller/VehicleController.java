package bai_tap_them2.controller;

import bai_tap_them2.service.VehicleServiceImpl;

import java.util.Scanner;

public class VehicleController {
    private VehicleServiceImpl vehicleService=new VehicleServiceImpl();
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG--\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose=input.nextInt();
            switch (choose){
                case 1:{
                    System.out.println("1. Thêm xe tải,\n" +
                            " 2. Thêm ôtô, \n" +
                            "3. Thêm  xe máy.\n");
                    System.out.print("chọn:");
                     int choosen=input.nextInt();

                }
                    break;
                case 5:System.exit(0);break;
            }
        }while (true);
    }
}

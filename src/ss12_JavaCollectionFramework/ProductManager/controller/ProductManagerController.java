package ss12_JavaCollectionFramework.ProductManager.controller;

import ss12_JavaCollectionFramework.ProductManager.service.ProductManagerServiceImpl;

import java.util.Scanner;

public class ProductManagerController {
    private static ProductManagerServiceImpl productManagerService = new ProductManagerServiceImpl();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n--Quản lí sản phẩm--\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "7.Thoát\n" +
                    "Chọn chức năng:");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    productManagerService.addProduct();
                    break;
                case 2:
                    productManagerService.updateProduct();
                    break;
                case 3:
                    productManagerService.removeProduct();
                    break;
                case 4:
                    productManagerService.findAllProduct();
                    break;
                case 5:
                    productManagerService.searchByName();
                    break;
                case 6:
                    productManagerService.sortProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}

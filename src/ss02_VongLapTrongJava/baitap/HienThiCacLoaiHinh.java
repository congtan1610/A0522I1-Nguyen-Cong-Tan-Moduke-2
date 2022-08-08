package ss02_VongLapTrongJava.baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông (Góc là hình vuông có 4 góc khác nhau: trên cùng bên trái, trên cùng bên phải, dưới cùng bên trái, dưới cùng bên phải)");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");
            System.out.printf("Mời chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("In hình chữ nhật");
                    System.out.printf("nhập chiều dài: ");
                    int a = input.nextInt();
                    System.out.printf("nhập chiều rộng: ");
                    int b = input.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= a; j++) {
                            System.out.print(" * ");
                        }
                        System.out.printf("\n");
                    }

                    break;
                case 2:
                    System.out.println("In hình tam giác vuông");
                    System.out.println("1.Trên cùng bên trái");
                    System.out.println("2.Trên cùng bên phải");
                    System.out.println("3.Dưới cùng bên trái");
                    System.out.println("4.Dưới cùng bên phải");
                    System.out.printf("Mời chọn:");
                    int c = input.nextInt();
                    if (c == 3) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.printf("\n");
                        }
                    } else if (c == 1) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 5 - i; j >= 1; j--) {
                                System.out.print(" * ");
                            }
                            System.out.printf("\n");
                        }
                    } else if (c == 2) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5; j++) {
                                if (i == 2 && j == 1 || i == 3 && j == 1 || i == 3 && j == 2 || i == 4 && j == 1 || i == 4 && j == 2 || i == 4 && j == 3 || i == 5 && j == 1 || i == 5 && j == 2 || i == 5 && j == 3 || i == 5 && j == 4) {
                                    System.out.printf("   ");
                                } else {
                                    System.out.print(" * ");
                                }
                            }
                            System.out.printf("\n");
                        }
                    } else if (c == 4) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5; j++) {
                                if (i == 4 && j == 1 || i == 3 && j == 1 || i == 3 && j == 2 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4) {
                                    System.out.printf("   ");
                                } else {
                                    System.out.print(" * ");
                                }
                            }
                            System.out.printf("\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("In tam giác cân");
                    System.out.printf("Nhập chiều dài cạnh:");
                    int m = input.nextInt();
                    for (int k = 1; k <= m; k++) {
                        for (int q = 1; q <= k; q++) {
                            System.out.print(" * ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("chọn lại!");
            }
        }
    }
}

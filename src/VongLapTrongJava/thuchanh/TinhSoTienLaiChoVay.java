package VongLapTrongJava.thuchanh;

import java.util.Scanner;

public class TinhSoTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập số tiền gửi: ");
        money = input.nextDouble();
        System.out.printf("Nhập số tháng gửi: ");
        month = input.nextInt();
        System.out.printf("Nhập lãi suất: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("lãi suất nhận được: " + totalInterest);
    }
}

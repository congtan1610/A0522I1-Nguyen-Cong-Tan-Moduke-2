package ss01_IntroductionJava.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        short rate=23000;
        System.out.printf("Enter your money(USD):");
        short USD=scanner.nextShort();
        long VND=rate*USD;
        System.out.println(USD+" USD = "+VND+" VND");
    }
}

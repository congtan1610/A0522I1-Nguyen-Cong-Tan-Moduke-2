package ss02_VongLapTrongJava.baitap;

import javax.swing.plaf.IconUIResource;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.printf("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.printf("" + i + ",");
            }
        }
    }
}

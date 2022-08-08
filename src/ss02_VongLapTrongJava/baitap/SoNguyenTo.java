package ss02_VongLapTrongJava.baitap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhập số lương số nguyên tố cần in ra:");
        int number=input.nextInt();
        int count=0;
        int N=2;
        while (count<number){
            boolean flag=true;
            for (int i=2;i<=N/2;i++){
                if (N%i==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.printf(" "+N+",");
                count++;
            }
            N++;
        }
    }
}

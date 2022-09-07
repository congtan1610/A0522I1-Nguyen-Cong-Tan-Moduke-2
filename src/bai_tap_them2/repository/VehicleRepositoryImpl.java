package bai_tap_them2.repository;

import bai_tap_them2.model.PhuongTien;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRepositoryImpl implements VehicleRepository {
    private Scanner input = new Scanner(System.in);
    private ArrayList<PhuongTien.Oto> otoList = new ArrayList<>();
    private ArrayList<PhuongTien.XeTai> xeTaiList = new ArrayList<>();
    private ArrayList<PhuongTien.XeMay> xeMayList = new ArrayList<>();
    private ArrayList<PhuongTien.HangSX> hangSanXuat = new ArrayList<>();

    {
        hangSanXuat.add(new PhuongTien.HangSX("A01", "Toyota", "Japan"));
        hangSanXuat.add(new PhuongTien.HangSX("A02", "Honda", "Japan"));
        hangSanXuat.add(new PhuongTien.HangSX("A03", "Mec", "Germany"));
    }


    @Override
    public void addOto() {
        Object hang;
        System.out.print("Nhập biển:");
        String bien = input.nextLine();
        System.out.print("Chọn hãng:\n " +
                "1.Toyota\n" +
                "2.Honda\n" +
                "3.Mec\n" +
                "Mời chọn:");
        int chooseOto = Integer.parseInt(input.nextLine());
        if (chooseOto == 1) {
            hang = hangSanXuat.get(0);
        } else if (chooseOto == 1) {
            hang = hangSanXuat.get(1);
        } else {
            hang = hangSanXuat.get(2);
        }
        System.out.print("Nhập năm sản xuất:");
        int nam = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ:");
        String chu = input.nextLine();
        System.out.print("Nhập chỗ ngồi:");
        int choNgoi = Integer.parseInt(input.nextLine());
        System.out.print("Nhập kiểu xe:");
        String kieuXe = input.nextLine();
        otoList.add(new PhuongTien.Oto(bien, hang, nam, chu, choNgoi, kieuXe));
    }


    @Override
    public void addXeTai() {
        Object hang;
        System.out.print("Nhập biển:");
        String bien = input.nextLine();
        System.out.print("Chọn hãng:\n " +
                "1.Toyota\n" +
                "2.Honda\n" +
                "3.Mec\n" +
                "Mời chọn:");
        int chooseOto = Integer.parseInt(input.nextLine());
        if (chooseOto == 1) {
            hang = hangSanXuat.get(0);
        } else if (chooseOto == 1) {
            hang = hangSanXuat.get(1);
        } else {
            hang = hangSanXuat.get(2);
        }
        System.out.print("Nhập năm sản xuất:");
        int nam = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ:");
        String chu = input.nextLine();
        System.out.print("Nhập trọng tải:");
        int trongTai = Integer.parseInt(input.nextLine());
        xeTaiList.add(new PhuongTien.XeTai(bien, hang, nam, chu, trongTai));
    }

    @Override
    public void addXeMay() {
        Object hang;
        System.out.print("Nhập biển:");
        String bien = input.nextLine();
        System.out.print("Chọn hãng:\n " +
                "1.Toyota\n" +
                "2.Honda\n" +
                "3.Mec\n" +
                "Mời chọn:");
        int chooseOto = Integer.parseInt(input.nextLine());
        if (chooseOto == 1) {
            hang = hangSanXuat.get(0);
        } else if (chooseOto == 1) {
            hang = hangSanXuat.get(1);
        } else {
            hang = hangSanXuat.get(2);
        }
        System.out.print("Nhập năm sản xuất:");
        int nam = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ:");
        String chu = input.nextLine();
        System.out.print("Nhập công suất:");
        String congSuat = input.nextLine();
        xeMayList.add(new PhuongTien.XeMay(bien, hang, nam, chu, congSuat));
    }

    @Override
    public void findAllOto() {
        if (otoList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (PhuongTien.Oto oto : otoList) {
                System.out.println(oto);
            }
        }
    }

    @Override
    public void findAllXeTai() {
        if (xeTaiList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (PhuongTien.XeTai xeTai : xeTaiList) {
                System.out.println(xeTai);
            }
        }
    }

    @Override
    public void findAllXeMay() {
        if (xeMayList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (PhuongTien.XeMay xeMay : xeMayList) {
                System.out.println(xeMay);
            }
        }
    }

    @Override
    public void removeOto() {
        System.out.print("Nhập biển số xe muốn xóa:");
        String bien = input.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            if (bien.equals(otoList.get(i).getBienSo())) {
                otoList.remove(i);
            }
        }
    }

    @Override
    public void removeXeTai() {
        System.out.print("Nhập biển số xe muốn xóa:");
        String bien = input.nextLine();
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bien.equals(xeTaiList.get(i).getBienSo())) {
                xeTaiList.remove(i);
            }
        }
    }

    @Override
    public void removeXeMay() {
        System.out.print("Nhập biển số xe muốn xóa:");
        String bien = input.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bien.equals(xeMayList.get(i).getBienSo())) {
                xeMayList.remove(i);
            }
        }
    }

    @Override
    public void findByIdOto() {
        if (otoList.isEmpty()){
            System.out.println("Danh sách trống");
            return;
        }
        System.out.print("Nhập biển số xe muốn tìm:");
        String bien = input.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            if (bien.equals(otoList.get(i).getBienSo())) {
                System.out.println(otoList.get(i));
            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }

    @Override
    public void findByIdXeMay() {
        if (xeMayList.isEmpty()){
            System.out.println("Danh sách trống");
            return;
        }
        System.out.print("Nhập biển số xe muốn tìm:");
        String bien = input.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (bien.equals(xeMayList.get(i).getBienSo())) {
                System.out.println(xeMayList.get(i));
            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }

    @Override
    public void findByIdXeTai() {
        if (xeTaiList.isEmpty()){
            System.out.println("Danh sách trống");
            return;
        }
        System.out.print("Nhập biển số xe muốn tìm:");
        String bien = input.nextLine();
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (bien.equals(xeTaiList.get(i).getBienSo())) {
                System.out.println(xeTaiList.get(i));
            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }
}

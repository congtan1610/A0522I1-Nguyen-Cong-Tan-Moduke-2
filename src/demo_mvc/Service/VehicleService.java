package demo_mvc.Service;

import demo_mvc.Model.Vehicle;
import demo_mvc.Repository.VehicleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService implements IVehicleService {
    private VehicleRepository vehicleRepository = new VehicleRepository();
    Scanner input = new Scanner(System.in);
    static ArrayList<Vehicle.HangSX> hangSXES = new ArrayList<>();

    static {
        hangSXES.add(new Vehicle.HangSX(1, "Toyota", "Japan"));
        hangSXES.add(new Vehicle.HangSX(2, "Honda", "Japan"));
        hangSXES.add(new Vehicle.HangSX(3, "Yamaha", "Japan"));
    }

    @Override
    public void addOto() {
        try {
            System.out.print("Nhập biển kiểm soát(String):");
            String bienKS = input.nextLine();
            System.out.println("chọn hãng sản xuất:");
            for (Vehicle.HangSX x : hangSXES) {
                System.out.println(x);
            }
            System.out.print("Mời chọn:");
            int choose = Integer.parseInt(input.nextLine());
            Object hangSX;
            if (choose == 1) {
                hangSX = hangSXES.get(0);
            } else if (choose == 2) {
                hangSX = hangSXES.get(1);
            } else if (choose == 3) {
                hangSX = hangSXES.get(2);
            } else {
                hangSX = null;
            }
            System.out.print("Nhập năm sản xuất(integer):");
            int namSX = Integer.parseInt(input.nextLine());
            System.out.print("Nhập chủ sở hữu(String):");
            String chu = input.nextLine();
            System.out.print("Nhập kiểu xe(String):");
            String kieuXe = input.nextLine();
            System.out.print("Nhập số chỗ ngồi(integer):");
            int soCho = Integer.parseInt(input.nextLine());
            Vehicle.Oto oto = new Vehicle.Oto(bienKS, hangSX, namSX, chu, soCho, kieuXe);
            vehicleRepository.addOto(oto);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public void addTruck() {

    }

    @Override
    public void addMotor() {

    }

    @Override
    public void findAllOto() {
        List<Vehicle.Oto> oto = vehicleRepository.findAllOto();
        if (oto.isEmpty()) {
            System.out.println("list null");
        } else {
            for (Vehicle.Oto x : oto) {
                System.out.println(x);
            }
        }
        System.out.println("\n");
    }

    @Override
    public void findAllTruck() {

    }

    @Override
    public void findAllMotor() {

    }

    @Override
    public void deleteOto() {
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdOto(bks) == null) {
            System.out.println("not found");
        } else {
            vehicleRepository.deleteOto(vehicleRepository.findByIdOto(bks));
            System.out.println("deleted!");
        }
        System.out.println("\n");
    }

    @Override
    public void deleteTruck() {

    }

    @Override
    public void deleteMotor() {

    }

    @Override
    public void findByIdOto() {
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdOto(bks) == null) {
            System.out.println("not found");
        } else {
            System.out.println(vehicleRepository.findByIdOto(bks));
        }
        System.out.println("\n");
    }

    @Override
    public void findByIdTruck() {

    }

    @Override
    public void findByIdMotor() {

    }
}

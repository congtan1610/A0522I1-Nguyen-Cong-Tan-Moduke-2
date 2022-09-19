package bt_them2.Service;

import bt_them2.Model.Vehicle;
import bt_them2.Repository.VehicleRepository;

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
            System.out.print("Nhập trọng tải(integer):");
            int trongTai = Integer.parseInt(input.nextLine());
            Vehicle.Truck truck = new Vehicle.Truck(bienKS, hangSX, namSX, chu, trongTai);
            vehicleRepository.addTruck(truck);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public void addMotor() {
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
            System.out.print("Nhập số công suất(integer):");
            int congSuat = Integer.parseInt(input.nextLine());
            Vehicle.Motor motor = new Vehicle.Motor(bienKS, hangSX, namSX, chu,congSuat);
            vehicleRepository.addMotor(motor);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
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
        List<Vehicle.Truck> trucks = vehicleRepository.findAllTruck();
        if (trucks.isEmpty()) {
            System.out.println("list null");
        } else {
            for (Vehicle.Truck x : trucks) {
                System.out.println(x);
            }
        }
        System.out.println("\n");
    }

    @Override
    public void findAllMotor() {
        List<Vehicle.Motor> motors = vehicleRepository.findAllMotor();
        if (motors.isEmpty()) {
            System.out.println("list null");
        } else {
            for (Vehicle.Motor x : motors) {
                System.out.println(x);
            }
        }
        System.out.println("\n");
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
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdTruck(bks) == null) {
            System.out.println("not found");
        } else {
            vehicleRepository.deleteTruck(vehicleRepository.findByIdTruck(bks));
            System.out.println("deleted!");
        }
        System.out.println("\n");
    }

    @Override
    public void deleteMotor() {
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdMotor(bks) == null) {
            System.out.println("not found");
        } else {
            vehicleRepository.deleteMotor(vehicleRepository.findByIdMotor(bks));
            System.out.println("deleted!");
        }
        System.out.println("\n");
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
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdTruck(bks) == null) {
            System.out.println("not found");
        } else {
            System.out.println(vehicleRepository.findByIdTruck(bks));
        }
        System.out.println("\n");
    }

    @Override
    public void findByIdMotor() {
        System.out.print("Nhập biển kiểm soát:");
        String bks = input.nextLine();
        if (vehicleRepository.findByIdMotor(bks) == null) {
            System.out.println("not found");
        } else {
            System.out.println(vehicleRepository.findByIdMotor(bks));
        }
        System.out.println("\n");
    }
}

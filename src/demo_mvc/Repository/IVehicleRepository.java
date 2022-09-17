package demo_mvc.Repository;

import demo_mvc.Model.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    void addOto(Vehicle.Oto oto);
    void addTruck(Vehicle.Truck truck);
    void addMotor(Vehicle.Motor motor);
    List<Vehicle.Oto> findAllOto();
    List<Vehicle.Truck> findAllTruck();
    List<Vehicle.Motor> findAllMotor();
    void deleteOto(Vehicle.Oto oto);
    void deleteTruck(Vehicle.Truck truck);
    void deleteMotor(Vehicle.Motor motor);
    Vehicle.Oto findByIdOto(String bks);
    void findByIdTruck(String bks);
    void findByIdMotor(String bks);
}

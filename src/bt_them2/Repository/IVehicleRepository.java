package bt_them2.Repository;

import bt_them2.Model.Vehicle;

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
    Vehicle.Truck findByIdTruck(String bks);
    Vehicle.Motor findByIdMotor(String bks);
}

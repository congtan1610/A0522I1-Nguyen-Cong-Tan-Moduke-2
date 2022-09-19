package bt_them2.Repository;

import bt_them2.Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    ArrayList<Vehicle.Oto> otos = new ArrayList<>();
    ArrayList<Vehicle.Truck> trucks = new ArrayList<>();
    ArrayList<Vehicle.Motor> motors = new ArrayList<>();

    @Override
    public void addOto(Vehicle.Oto oto) {
        otos.add(oto);
    }

    @Override
    public void addTruck(Vehicle.Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void addMotor(Vehicle.Motor motor) {
        motors.add(motor);
    }

    @Override
    public List<Vehicle.Oto> findAllOto() {
        return otos;
    }

    @Override
    public List<Vehicle.Truck> findAllTruck() {
        return trucks;
    }

    @Override
    public List<Vehicle.Motor> findAllMotor() {
        return motors;
    }

    @Override
    public void deleteOto(Vehicle.Oto oto) {
        otos.remove(oto);
    }

    @Override
    public void deleteTruck(Vehicle.Truck truck) {
        trucks.remove(truck);
    }

    @Override
    public void deleteMotor(Vehicle.Motor motor) {
        motors.remove(motor);
    }

    @Override
    public Vehicle.Oto findByIdOto(String bks) {
        if (otos.indexOf(new Vehicle.Oto(bks)) == -1) {
            return null;
        } else {
            return otos.get(otos.indexOf(new Vehicle.Oto(bks)));
        }
    }

    @Override
    public Vehicle.Truck findByIdTruck(String bks) {
        if (trucks.indexOf(new Vehicle.Truck(bks)) == -1) {
            return null;
        } else {
            return trucks.get(trucks.indexOf(new Vehicle.Truck(bks)));
        }
    }

    @Override
    public Vehicle.Motor findByIdMotor(String bks) {
        if (motors.indexOf(new Vehicle.Motor(bks)) == -1) {
            return null;
        } else {
            return motors.get(motors.indexOf(new Vehicle.Motor(bks)));
        }
    }
}

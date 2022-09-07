package bai_tap_them2.service;

import bai_tap_them2.repository.VehicleRepository;
import bai_tap_them2.repository.VehicleRepositoryImpl;

public class VehicleServiceImpl implements VehicleService {
    private VehicleRepositoryImpl vehicleRepository = new VehicleRepositoryImpl();


    @Override
    public void addOto() {
        vehicleRepository.addOto();
    }

    @Override
    public void addXeTai() {
        vehicleRepository.addXeTai();
    }

    @Override
    public void addXeMay() {
        vehicleRepository.addXeMay();
    }

    @Override
    public void findAllOto() {
        vehicleRepository.findAllOto();
    }

    @Override
    public void findAllXeTai() {
        vehicleRepository.findAllXeTai();
    }

    @Override
    public void findAllXeMay() {
        vehicleRepository.findAllXeMay();
    }

    @Override
    public void removeOto() {
        vehicleRepository.removeOto();
    }

    @Override
    public void removeXeTai() {
        vehicleRepository.removeXeTai();
    }

    @Override
    public void removeXeMay() {
        vehicleRepository.removeXeMay();
    }

    @Override
    public void findByIdOto() {
        vehicleRepository.findByIdOto();
    }

    @Override
    public void findByIdXeMay() {
        vehicleRepository.findByIdXeMay();
    }

    @Override
    public void findByIdXeTai() {
        vehicleRepository.findByIdXeTai();
    }
}

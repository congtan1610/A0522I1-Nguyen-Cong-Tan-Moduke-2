package bai_tap_them2.service;

import bai_tap_them2.repository.VehicleRepository;
import bai_tap_them2.repository.VehicleRepositoryImpl;

public class VehicleServiceImpl implements VehicleService {
    private VehicleRepositoryImpl vehicleRepository = new VehicleRepositoryImpl();

    @Override
    public void add(int choose) {
        vehicleRepository.add(choose);
    }

    @Override
    public void findAll() {
        vehicleRepository.findAll();
    }

    @Override
    public void remove() {
        vehicleRepository.remove();
    }

    @Override
    public void findById() {
        vehicleRepository.findById();
    }
}

package bai_tap_them2.repository;

public interface IVehicleRepository {
    void addOto();
    void addXeTai();
    void addXeMay();
    void findAllOto();
    void findAllXeTai();
    void findAllXeMay();
    void removeOto();
    void removeXeTai();
    void removeXeMay();
    void findByIdOto();
    void findByIdXeMay();
    void findByIdXeTai();
}

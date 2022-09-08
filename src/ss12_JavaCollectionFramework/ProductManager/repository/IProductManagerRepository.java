package ss12_JavaCollectionFramework.ProductManager.repository;

import ss12_JavaCollectionFramework.ProductManager.model.Product;

import java.util.List;

public interface IProductManagerRepository {
    void addProduct(Product product);
    void updateProduct(int id,Product product);
    void removeProduct(int id);
    List<Product> findAllProduct();
    List<Product> searchByName(String name);
    void sortProduct();
}

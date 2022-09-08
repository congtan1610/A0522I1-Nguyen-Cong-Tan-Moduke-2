package ss12_JavaCollectionFramework.ProductManager.service;

import ss12_JavaCollectionFramework.ProductManager.model.Product;
import ss12_JavaCollectionFramework.ProductManager.repository.ProductManagerRepositoryImpl;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagerServiceImpl implements IProductManagerService {
    private Scanner input = new Scanner(System.in);
    private ProductManagerRepositoryImpl productManagerRepository = new ProductManagerRepositoryImpl();

    @Override
    public void addProduct() {
        System.out.print("Nhập id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên sp:");
        String name = input.nextLine();
        System.out.print("Nhập giá:");
        int price = Integer.parseInt(input.nextLine());
        Product product = new Product(id, name, price);
        productManagerRepository.addProduct(product);
    }

    @Override
    public void updateProduct() {
        System.out.print("Nhập id sản phẩm muốn sửa:");
        int idUpdate = Integer.parseInt(input.nextLine());
        System.out.print("Nhập id mới:");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên sp mới:");
        String name = input.nextLine();
        System.out.print("Nhập giá mới:");
        int price = Integer.parseInt(input.nextLine());
        Product product = new Product(id, name, price);
        productManagerRepository.updateProduct(idUpdate, product);
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập id sản phẩm muốn xóa:");
        int id = Integer.parseInt(input.nextLine());
        productManagerRepository.removeProduct(id);
    }

    @Override
    public void findAllProduct() {
        List<Product> list = productManagerRepository.findAllProduct();
        if (list == null) {
            System.out.println("Danh sách trống");
        } else {
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void searchByName() {
        System.out.print("Nhập tên sản phẩm muốn tìm:");
        String name = input.nextLine();
        List<Product> search = productManagerRepository.searchByName(name);
        if (search==null){
            System.out.println("không tìm thấy");
        }else{
            for (Product product:search){
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortProduct() {
        List<Product> list = productManagerRepository.findAllProduct();
        Collections.sort(list);
        if (list == null) {
            System.out.println("Danh sách trống");
        } else {
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }
}

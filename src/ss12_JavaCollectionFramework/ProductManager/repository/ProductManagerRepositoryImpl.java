package ss12_JavaCollectionFramework.ProductManager.repository;

import ss12_JavaCollectionFramework.ProductManager.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagerRepositoryImpl implements ProductManagerRepository {
    private static ArrayList<Product> listProduct = new ArrayList<>();

    static {
        listProduct.add(new Product(4, "iphone4", 123));
        listProduct.add(new Product(2, "iphone5", 123));
        listProduct.add(new Product(1, "iphone4", 123));

    }

    @Override
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        if (listProduct.indexOf(new Product(id)) == -1) {
            System.out.println("không tìm thấy id vừa nhập");
        } else {
            listProduct.set(listProduct.indexOf(new Product(id)), product);
        }

    }

    @Override
    public void removeProduct(int id) {
        if (listProduct.indexOf(new Product(id)) == -1) {
            System.out.println("không tìm thấy id vừa nhập");
        } else {
            listProduct.remove(listProduct.indexOf(new Product(id)));
        }
//        cách 2
//        for (int i = 0; i < listProduct.size(); i++) {
//            if (idRemove.equals(listProduct.get(i).getId())) {
//                listProduct.remove(i);
//            }
//        }
    }

    @Override
    public List<Product> findAllProduct() {
        if (listProduct.isEmpty()) {
            return null;
        } else {
            return listProduct;
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> search = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                search.add(listProduct.get(i));
            }
        }
        if (search.isEmpty()) {
            return null;
        } else {
            return search;
        }
    }

    @Override
    public void sortProduct() {
    }
}

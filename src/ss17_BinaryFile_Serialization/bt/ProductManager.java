package ss17_BinaryFile_Serialization.bt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    static final String filePath="D:\\module2\\src\\ss17_BinaryFile_Serialization\\bt\\productManager.txt";
  static   List<Product> products=new ArrayList<>();
    static class Product implements Serializable {
        private static final long serialVersionUID = 8321;

        private int id;
        private String name;
        private String firm;
        private double price;
        private String description;

        public Product(int id, String name, String firm, double price, String description) {
            this.id = id;
            this.name = name;
            this.firm = firm;
            this.price = price;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", firm='" + firm + '\'' +
                    ", price=" + price +
                    ", description='" + description + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirm() {
            return firm;
        }

        public void setFirm(String firm) {
            this.firm = firm;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
    void write(List<Product> products) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(products);
        oos.close();
    }
    void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        List<Product> product=(List<Product>) ois.readObject();
        System.out.println(product);
        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        products.add(new Product(1,"s","ss",123,"sad"));
        products.add(new Product(1,"s","ss",123,"sad"));
        products.add(new Product(1,"s","ss",123,"sad"));
        ProductManager product=new ProductManager();
        product.write(products);
        product.read();
    }
}

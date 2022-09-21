package ss17_BinaryFile_Serialization.bt;

import java.io.*;
import java.util.Scanner;

public class ExProduct {
    static class Product implements Serializable {
        private static final long serialVersionUID = 213578321;

        private int id;
        private String name;
        private double price;
        private String description;

        public Product(int id, String name, double price, String description) {
            this.id = id;
            this.name = name;
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

        public void setName(String name) {
            this.name = name;
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

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    private static String filePath = null;

    void write(Product product) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(product);
            oos.flush();
            oos.close();
            System.out.println("Success!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    void read() {
        try {ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            Product product = null;
            product = (Product) ois.readObject();
            System.out.println(product);
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your filepath:");
        filePath = input.nextLine();
        ExProduct ex = new ExProduct();

        Product product = new Product(1, "IPhone 12", 2800000, "New");
        System.out.println("-write");
        ex.write(product);
        System.out.println("-read");
        ex.read();
    }
}




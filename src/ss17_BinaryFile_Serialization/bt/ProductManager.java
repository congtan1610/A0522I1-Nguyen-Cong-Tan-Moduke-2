package ss17_BinaryFile_Serialization.bt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
   static Scanner input   =new Scanner(System.in);
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
                    '}'+"\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Product)) return false;
            Product product = (Product) o;
            return getId() == product.getId();
        }

        @Override
        public int hashCode() {
            return 0;
        }

        public Product(int id) {
            this.id = id;
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
        //đọc file ra products list
        for (Product x:product){
            products.add( x);
        }
        ois.close();
    }
    void addProduct() throws IOException {
        try{
            System.out.println("Enter id product:");
            int id= Integer.parseInt(input.nextLine());
            System.out.println("Enter name product:");
            String name=input.nextLine();
            System.out.println("Enter firm product:");
            String firm=input.nextLine();
            System.out.println("Enter price product:");
            long price= Long.parseLong(input.nextLine());
            System.out.println("Enter description product:");
            String des=input.nextLine();
            products.add(new Product(id,name,firm,price,des));
            write(products);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void findProduct(){
        System.out.println("Enter find id:");
        int idFind= Integer.parseInt(input.nextLine());
        if(products.indexOf(new Product(idFind))==-1){
            System.out.println("Not find");
        }else{
            System.out.println(products.get(products.indexOf(new Product(idFind))));
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ProductManager product=new ProductManager();
        do{
            System.out.println("---Product Manager---");
            System.out.println("1.Add Product");
            System.out.println("2.Display Product");
            System.out.println("3.Find Product");
            System.out.println("4.Exit");
            System.out.print("Choose:");
            int choose= Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    product.addProduct();
                    product.read();
                    break;
                case 2:
                    products.clear();
                    product.read();
//                    check products list
//                    for (Product x:products){
//                        System.out.println(x);
//                    }
                    break;
                case 3:
                    product.findProduct();
                    break;
                case 4: System.exit(0);
                default:
                    System.out.println("Not choose!");
            }
        }while (true);
    }
}

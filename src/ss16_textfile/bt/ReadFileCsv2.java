package ss16_textfile.bt;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileCsv2 {
    List<ReadFileCsv2.Country> lists = new ArrayList<>();
    static String filePath = null;

    static class Country {
        private int id;
        private String code;
        private String name;

        public Country(int id, String code, String name) {
            this.id = id;
            this.code = code;
            this.name = name;
        }

        public Country() {
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return  id+ ",\"" + code + "\",\""+ name+ "\"";
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private void read() {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] tmp;
            while ((line = br.readLine()) != null) {
                tmp = line.split(",");
                lists.add(new ReadFileCsv2.Country(Integer.parseInt(tmp[0]), tmp[1], tmp[2]));
            }
            if (lists.isEmpty()) {
                throw new Exception();
            }
            for (Object x : lists) {
                System.out.println(x);
            }
            br.close();
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("file null or error");
        }
    }

    private void write(Country country) {
        try {
            File file = new File(filePath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("\n"+(new Country(country.id, country.code, country.name)));
            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your filepath:");
        filePath = input.nextLine();
        ReadFileCsv2 ex = new ReadFileCsv2();
        System.out.println("\n menu");
        System.out.println("1.read");
        System.out.println("2.write ");
        System.out.println("Choose:");
        int choose = Integer.parseInt(input.nextLine());
        if (choose == 1) {
            ex.read();
        } else if (choose == 2) {
            try {
                System.out.println("Enter coutry id:");
                int id = Integer.parseInt(input.nextLine());
                System.out.println("Enter coutry code:");
                String code = input.nextLine();
                System.out.println("Enter coutry name:");
                String name = input.nextLine();
                ex.write(new Country(id, code, name));
            } catch (Exception e) {
                System.out.println("Enter Error");
            }
        } else {
            System.out.println("Not choose");
        }
    }
}

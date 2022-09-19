package ss16_textfile.bt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
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
            return "Country{" +
                    "id=" + id +
                    ", code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    '}';
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

    public static void main(String[] args) {
        List<Country> lists = new ArrayList<>();
        try {
            File file = new File("D:\\module2\\src\\ss16_textfile\\bt\\ds.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] tmp;
            while ((line = br.readLine()) != null) {
                tmp = line.split(",");
                lists.add(new Country(Integer.parseInt(tmp[0]), tmp[1], tmp[2]));
            }
            if (lists.isEmpty()){
                throw new Exception();
            }
            for (Object x : lists) {
                System.out.println(x);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("file error");
        }
    }
}

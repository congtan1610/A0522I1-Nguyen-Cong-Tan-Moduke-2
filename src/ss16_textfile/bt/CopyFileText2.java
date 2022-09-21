package ss16_textfile.bt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText2 {
    static List<Object> objects = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập file nguồn:");
        String in = input.nextLine();
        System.out.println("Nhập file nhận:");
        String out = input.nextLine();
        readFile(in);
        writeFile(out);
    }

    static void readFile(String fileIn) {
        try {
            File in = new File(fileIn);
            BufferedReader br = new BufferedReader(new FileReader(in));
            if (!in.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = br.readLine()) != null) {
                objects.add(line);
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("file nguồn không tồn tại hoặc file lỗi");
        }
    }

    static void writeFile(String fileOut) {
        try {
            File out = new File(fileOut);
            BufferedWriter bw = new BufferedWriter(new FileWriter(out, true));
            if (!out.exists()) {
                throw new FileNotFoundException();
            }
            for (Object x : objects) {
                bw.write("\n" + x);
            }
            objects.clear();
            bw.close();
            System.out.println("xong");
        } catch (Exception e) {
            System.out.println("file nhận đã tồn tại hoặc file lỗi");
        }
    }
}

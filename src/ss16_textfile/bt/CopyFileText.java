package ss16_textfile.bt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        List<Object> objects=new ArrayList<>();
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Nhập file nguồn:");
            String fileIn=input.nextLine();
            System.out.println("Nhập file ra:");
            String fileOut=input.nextLine();
            File in = new File(fileIn);
            File out = new File(fileOut);

            if (!in.exists()) {
                throw new FileNotFoundException();
            }
            if (!out.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(in));
            String line = "";
            while ((line = br.readLine()) != null) {
                objects.add(line);
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(out,true));
            for (Object x:objects){
                bw.write("\n"+x);
            }
            bw.close();
            br.close();
            System.out.println("xong!");
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

}

package ss17_BinaryFile_Serialization.bt;

import java.io.*;

public class CopyFileNhiPhan {
    static final String in = "D:\\module2\\src\\ss17_BinaryFile_Serialization\\bt\\in.txt";
    static final String out = "D:\\module2\\src\\ss17_BinaryFile_Serialization\\bt\\out.txt";

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest, true);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                System.out.println("byte:" +length);
            }

        } catch (Exception e) {
            System.out.println("The source file does not exist or the destination file already exists");
        } finally {

            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        File sourceFile = new File(in);
        File destFile = new File(out);

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}

import java.io.*;

public class ExceptionEx15 {
    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("Invalid File Name");
            }
        } catch (Exception exception) {
            fileName = "Untitled.txt";
        }
        File f = new File(fileName);
        createNewFile(f);
        return f;
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception exception) { }
    }

    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println( "Created File : " + f.getName());
    }
}

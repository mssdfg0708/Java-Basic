package Second;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class FileEx01 {
    static int totalFiles = 0;
    static int totalDirectories = 0;

    public static void main(String[] args) {
        File dir = new File("Your Pathname");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid Direction!");
            System.exit(0);
        }

        printFileList(dir);
        System.out.println("Total Files : " + totalFiles);
        System.out.println("Total Directory : " + totalDirectories);
    }

    public static void printFileList(File dir) {
        System.out.println(dir.getAbsolutePath() + " [path]");
        File[] files = dir.listFiles();
        ArrayList<String> subDir = new ArrayList<>();

        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            String filename = files[i].getName();
            if (files[i].isDirectory()) {
                filename = "[" + filename + "]";
                subDir.add(i + "");
            }
            System.out.println(filename);
        }

        int dirNum = subDir.size();
        int fileNum = files.length - dirNum;

        totalFiles += fileNum;
        totalDirectories += dirNum;

        System.out.println("fileNum : " + fileNum + " , DirectoryNum : " + dirNum);
        System.out.println();

        for (String s : subDir) {
            int index = Integer.parseInt(s);
            printFileList(files[index]);
        }
    }
}

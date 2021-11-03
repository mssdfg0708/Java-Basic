package First;

import java.io.*;

public class Control_04 {
    public static void practice01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        if (60 <= score && score <= 100) {
            System.out.println("Pass!");
        }
        else if (0 <= score && score < 60){
            System.out.println("Fail");
        }
        else {
            System.out.println("Score out of range 0 - 100");
        }
    }
    public static void practice02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zero = Integer.parseInt(br.readLine());
        if (zero == 0) {
            System.out.println("Zero!");
        }
        else {
            System.out.println("NOT Zero!");
        }
    }
    public static void practice03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int level = Integer.parseInt(br.readLine());
        if (!(1 <= level && level <= 3)) {
            System.out.println("level out of range 1- 3");
            return;
        }
        switch (level) {
            case 1:
                System.out.println("level 1");
                break;
            case 2:
                System.out.println("level 2");
                break;
            case 3:
                System.out.println("level 3");
                break;
        }
        switch (level) {
            case 1:
                System.out.println("Guest");
                break;
            case 2: case 3:
                System.out.println("Admin");
                break;
        }
    }
    public static void practice04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String identifyNum = br.readLine();
        if (identifyNum.length() != 14) {
            System.out.println("INPUT ERROR!");
            return;
        }
        int gender = identifyNum.charAt(7) - '0';
        switch (gender) {
            case 1: case 3:
                System.out.println("Male");
                break;
            case 2: case 4:
                System.out.println("Female");
                break;
            default:
                System.out.println("INPUT ERROR!");
        }
    }
    public static void practice05() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = i * 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void practice06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
    public static void practice07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int root = Integer.parseInt(br.readLine());
        String[] result = new String[root];
        for (int i = 0; i < root; i ++) {
            String item = Integer.toString(i+1);
            int clapCount = 0;
            StringBuilder buffer = new StringBuilder();
            for (int k = 0; k < item.length(); k++) {
                char letter = item.charAt(k);
                if (letter == '3' || letter == '6' || letter == '9') {
                    clapCount += 1;
                }
                else {
                    buffer.append(letter);
                }
            }
            if (clapCount > 0) {
                buffer = new StringBuilder();
                for (int k = 0; k < clapCount; k++) {
                    buffer.append("Clap! ");
                }
                result[i] = buffer.toString();
            }
            else {
                result[i] = buffer.toString();
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) throws IOException {
//        practice01();
//        practice02();
//        practice03();
//        practice04();
//        practice05();
//        practice06();
//        practice07();
    }
}

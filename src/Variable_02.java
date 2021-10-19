import java.util.*;
import java.io.*;

public class Variable_02 {
    public static void practice01() throws IOException {
        final double PI = 3.14;
        int age = 26;
        int year = 21;
        String name = "Seo dongwan";
        year += 2000;
        System.out.println(name);
        System.out.println(age);
        System.out.println(year);

        int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x + " y=" + y);

        double f = 10.5;
        System.out.println(f);

        Date today = new Date();
        System.out.println(today);
        System.out.println(PI);

        int big_num = 987_654_321;
        System.out.println(big_num);

        int a = 7;
        System.out.println("" + a + a);

        System.out.printf("Year : %8d%n", year);
        System.out.printf("Year : %-8d%n", year);
        System.out.printf("Year : %08d%n", year);

//        입력 모듈
//        Scanner scan = new Scanner(System.in);
//        String des = scan.nextLine();
//        System.out.println(des);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        des = br.readLine();
//        System.out.println(des);
    }
    public static void practice02() throws IOException {
        int x = 10;
        boolean True = true;
        double d = 3.14;
        char c = 'A';
        String s = "JAVA";
        System.out.println(x);
        System.out.println(True);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);

        d = 0.0000000011;
        System.out.println(d);

        String str = "970107";
        int num = Integer.parseInt(str);
        System.out.println(num + 1);
        str = Integer.toString(num);
        System.out.println(str + 1);
    }
    public static void main(String[] args) throws IOException {
        practice01();
        practice02();
    }
}

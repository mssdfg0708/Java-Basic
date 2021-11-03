package First;

import java.io.*;

public class Operator_03 {
    public static void practice01() throws IOException {
        System.out.println(-3 - 5 + 10);
        int x = 10;
        int y = 25;
        System.out.println(x > y || x < y);
        int i = 20;
        double d = 3.14;
        int z = i + (int)d;
        System.out.println(z);

        int p = 5;
        x = p++;
        p = 5;
        y = ++p;
        System.out.println(x + " " + y);
        System.out.println(5 % 3);

        long a = 1000000L * 1000000;
        System.out.println(a);

        for (i = 0; i < 26; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();

        double PI = 3.141592;
        double SHORT_PI = Math.round(PI * 1000) / 1000.0;
        System.out.println(SHORT_PI);

        String strA = "JAVA";
        String strB = "JAVA";
        if (strA.equals(strB)) {
            System.out.println("A == B");
        }
        else {
            System.out.println("A != B");
        }
    }
    public static boolean isAlpha() throws IOException {
        boolean res = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i);
            if (!(index >= 65 && index <= 122)) {
                res = false;
                break;
            }
        }
        System.out.println(res);
        return res;
    }
    public static void bitMasking() throws IOException{
        int hex = 0xABCD;
        int mask = 0xF;

        System.out.printf("hex = %X %n", hex);
        while (hex != 0) {
            System.out.printf("%X %n", hex & mask);
            hex = hex >> 4;
        }
    }
    public static void main(String[] args) throws IOException {
//        practice01();
//        isAlpha();
//        bitMasking();
    }
}

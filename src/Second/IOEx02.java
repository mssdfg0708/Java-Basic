package Second;

import java.io.*;
import java.util.Scanner;

public class IOEx02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("BufferedReader Input : ");
        String text01 = br.readLine();
        System.out.println("BufferedReader Output : " + text01);
        System.out.println();

        System.out.print("Input Integer : ");
        int num01 = Integer.parseInt(br.readLine());
        System.out.println("Integer Output : " + num01);
        System.out.println("Integer + 1 : " + (num01 + 1));
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Scanner Input : ");
        String text02 = scan.next();
        System.out.println("Scanner Output : " + text02);
        System.out.println();

        System.out.print("Input Integer : ");
        int num02 = scan.nextInt();
        System.out.println("Integer Output : " + num02);
        System.out.println("Integer + 1 : " + (num02 + 1));
        System.out.println();
    }
}

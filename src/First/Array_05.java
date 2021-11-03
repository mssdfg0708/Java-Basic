package First;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Array_05 {
    public static void practice01() {
        int[] score = new int[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("length = " + score.length);
        for (int item : score) {
            System.out.print(item + " ");
        }

        score = new int[20];
        System.out.println();
        System.out.println("length = " + score.length);
        for (int i = 0; i < score.length; i ++) {
            score[i] = i * 5;
            System.out.print(score[i] + " ");
        }

        char[] letters = new char[] {'J', 'a', 'v', 'a', '-', 'S', 'p', 'r', 'i', 'n', 'g'};
        System.out.println();
        System.out.println(letters);

        String[] name = new String[10];
        System.out.println("length = " + name.length);
        for (String item : name) {
            if (item != null) {
                System.out.print(item + " ");
            }
        }
    }
    public static void practice02() {
        int[] first = new int[20];
        for (int i = 0; i < first.length; i++) {
            first[i] = i * 2;
        }
        int[] second = new int[10];
        for (int i = 0; i <second.length; i++) {
            second[i] = 90 - i;
        }
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        for (int item : result) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println((float)95/4);
    }
    public static void practice03() {
        int[] score = new int[] {88, 82, 90, 76, 84};
        int sum = Arrays.stream(score).sum();
        System.out.println("Sum : " + sum);

        OptionalDouble avg = Arrays.stream(score).average();
        System.out.println("Average : " + avg.getAsDouble());

        OptionalInt max = Arrays.stream(score).max();
        System.out.println("Max : " + max.getAsInt());

        OptionalInt min = Arrays.stream(score).min();
        System.out.println("Min : " + min.getAsInt());

    }
    public static void practice04() {
        int[] array = new int[] {-3, 20, 7, 0, 9, 77, -93, 2, 10, 56};
        for (int firstIndex = 0; firstIndex < array.length - 1; firstIndex++) {
            boolean changed = false;
            for (int secondIndex = 0; secondIndex < array.length - firstIndex - 1; secondIndex++) {
                if (array[secondIndex] > array[secondIndex + 1]) {
                    changed = true;
                    int temp = array[secondIndex];
                    array[secondIndex] = array[secondIndex + 1];
                    array[secondIndex + 1] = temp;
                }
            }
            if (!changed) {
                System.out.println(firstIndex + " break!");
                break;
            }
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
    public static void practice05() {
        int[][] arrays = new int[5][];
        int[] arr01 = new int[10];
        int[] arr02 = new int[10];
        int[] arr03 = new int[10];
        int[] arr04 = new int[10];
        int[] arr05 = new int[10];
        arrays[0] = arr01;
        arrays[1] = arr02;
        arrays[2] = arr03;
        arrays[3] = arr04;
        arrays[4] = arr05;
        for (int[] row: arrays) {
            for (int item: row) {
                System.out.print(item);
            }
        }
    }
    public static void practice06() {
        int[][] score = new int[][] {{90, 80, 70},
                                     {100, 80, 60},
                                     {80, 70, 70},
                                     {60, 90, 90}};
        System.out.println(score[1][2]);

        for (int i = 0; i < score.length; i++) {
            for (int k = 0; k < score[i].length; k++) {
                score[i][k] = (i * 10) + (k * 10);
            }
        }
        for (int[] row : score) {
            for (int item : row) {
                System.out.printf("%2d ", item);
            }
            System.out.println();
        }
        System.out.println(score[2][2]);
    }
    public static void main(String[] args){
//        practice01();
//        practice02();
//        practice03();
//        practice04();
//        practice05();
//        practice06();
    }
}
//
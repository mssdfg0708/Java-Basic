package First;

import java.util.Arrays;

class Tv {
    String color = "black";
    boolean power = false;
    int channel = 9;
    int volume = 10;

    void togglePower() {
        power = !power;
    }
    void upChannel() {
        channel += 1;
    }
    void downChannel() {
        channel -= 1;
    }
    void printChannel() {
        if (power) {
            System.out.println("channel : " + channel);
        }
    }
}

class Time {
    private int hour;
    private int minute;
    private double second;

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public double getSecond() {
        return second;
    }
    public void getTime() {
        System.out.printf("%2d : %2d : %2.0f %n", hour, minute, second);
    }

    public void setHour(int h) {
        if (0 <= h && h <= 23) {
            hour = h;
        }
    }
    public void setMinute(int m) {
        if (0 <= m && m <= 59) {
            minute = m;
        }
    }
    public void setSecond(double s) {
        if (0 <= s && s <= 59) {
            second = s;
        }
    }
}

class Data {
    int x = 10;
}

class Math01 {
    long a, b;

    long add() { return a + b; }
    long sub() { return a - b; }
    long mul() { return a * b; }
    double div() {
        if (b == 0) {
            System.out.println("Can not divide by 0");
            return -1;
        }
        return a / b;
    }

    static long add(long a, long b) { return a + b; }
    static long sub(long a, long b) { return a - b; }
    static long mul(long a, long b) { return a * b; }
    static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Can not divide by 0");
            return -1;
        }
        return a / b;
    }
}

class OverloadAdd {
    int add(int x, int y) {
        System.out.print("int add : ");
        return x + y;
    }
    long add(long x, long y) {
        System.out.print("long add : ");
        return x + y;
    }
    float add(float x, float y) {
        System.out.print("float add : ");
        return x + y;
    }
    double add(double x, double y) {
        System.out.print("double add : ");
        return x + y;
    }
    int add(int[] a) {
        System.out.print("int[] add : ");
        int result = 0;
        for (int item : a) {
            result += item;
        }
        return result;
    }
}

class Card{
    String shape;
    String num;
    Card() {
        this("Spade", "A");
    }
    Card(String shape, String num) {
        this.shape = shape;
        this.num = num;
    }
    Card(Card card) {
        this(card.shape, card.num);
    }
}

class Phone{
    static String model;
    int serialNum = 0;
    int userNum;

    static { model = "Galaxy 20"; }
    { serialNum += 1; }

    Phone (int userNum){
        this.userNum = userNum;
        System.out.printf( "%s / %d%d", model, serialNum, userNum);
        System.out.println();
    }

    void printSpec() {
        System.out.printf( "%s / %d%d", model, serialNum, userNum);
        System.out.println();
    }
}

public class OOP1_06 {
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n > 0 && n < 13) {
            return n * factorial(n - 1);
        }
        else {
            System.out.println("Input Out Of Range");
            return -1;
        }
    }

    static void function01() {
        System.out.println("function01!");
    }

    static void changeX(int x) {
        x = 999;
    }

    static void changeData(Data d) {
        d.x = 999;
    }

    static void practice01() {
        Tv[] tvList = new Tv[3];
        for (int i = 0; i < tvList.length; i++) {
            tvList[i] = new Tv();
        }
        tvList[0].togglePower();
        tvList[0].upChannel();
        tvList[0].printChannel();
        tvList[0].togglePower();

        Time time1 = new Time();
        time1.setHour(22);
        time1.setMinute(35);
        time1.setSecond(38.725);
        time1.getTime();

        Data d1 = new Data();
        d1.x = 100;
        changeX(d1.x);
        System.out.println("d1.x : " + d1.x);
        changeData(d1);
        System.out.println("d1.x : " + d1.x);
    }

    static void practice02() {
        int[] arr = new int[] {7, 5, 3, 2, 5, 1, 6};
        Arrays.sort(arr);

        int sum = 0;
        for (int item : arr) {
            sum += item;
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Sum : " + sum);
        for (int i = -1; i <= 13; i++ ) {
            System.out.printf("factorial %2d : %-9d %n", i, factorial(i));
        }
    }

    static void practice03() {
        System.out.println(Math01.add(100, 200));
        System.out.println(Math01.sub(100, 200));
        System.out.println(Math01.mul(100, 200));
        System.out.println(Math01.div(100, 200));

        Math01 math01 = new Math01();
        math01.a = 50;
        math01.b = 20;

        System.out.println(math01.add());
        System.out.println(math01.sub());
        System.out.println(math01.mul());
        System.out.println(math01.div());
    }

    public static void practice04() {
        OverloadAdd oa = new OverloadAdd();
        int intX = oa.add(3, 4);
        System.out.println(intX);
        long longX = oa.add(3L, 4L);
        System.out.println(longX);
        float floatX = oa.add(3.14F, 3.14F);
        System.out.println(floatX);
        double doubleX = oa.add(3.14, 3.14);
        System.out.println(doubleX);
        int arrX;
        int[] arrY = new int[] {3, 5, 9, 4, 2};
        arrX = oa.add(arrY);
        System.out.println(arrX);
    }

    public static void practice05() {
        Card card1 = new Card("Heart", "7");
        Card card2 = new Card();
        Card card3 = new Card(card1);
        System.out.println(card1.shape + " " + card1.num);
        System.out.println(card2.shape + " " + card2.num);
        System.out.println(card3.shape + " " + card3.num);

    }

    public static void practice06() {
        Phone phone1 = new Phone(77);
        Phone phone2 = new Phone(97);
        Phone phone3 = new Phone(13);

        phone1.printSpec();
        phone2.printSpec();
        phone3.printSpec();
    }

    public static void main(String[] args) {
        function01();
//        practice01();
//        practice02();
//        practice03();
//        practice04();
//        practice05();
//        practice06();
    }
}
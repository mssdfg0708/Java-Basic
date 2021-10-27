class Tv07 {
    boolean power;
    int channel;
    int volume;
    void togglePower() { power = !power; }
    void channelUp() { channel += 1; }
    void channelDown() { channel -= 1; }
}

class CaptionTv07 extends Tv07 {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf(" color = %s %n", color);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() {
        this(0, 0);
    }

    String getPoint() {
        String result = "(" + x + ", " + y + ")";
        return result;
    }
}

class Circle extends Shape {
    Point center;
    int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    Circle() {
        this(new Point(0, 0), 100);
    }

    void draw() {
        System.out.printf("Circle / center = (%d, %d) / radius = %d / color = %s %n",
                center.x, center.y, radius, color);
    }
}

class Triangle extends Shape {
    Point[] p;

    Triangle(Point[] p)  {
        this.p = p;
    }

    void draw() {
        System.out.printf("Triangle / Point1 = %s / Point2 = %s / Point3 = %s / color = %s %n",
                p[0].getPoint(), p[1].getPoint(), p[2].getPoint(), color);
    }
}

class Deck07 {
    final int CARD_NUM = 52;
    Card07[] cardList = new Card07[CARD_NUM];

    Deck07() {
        int i = 0;
        for (int k = Card07.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card07.NUM_MAX; n++) {
                cardList[i] = new Card07(k, n+1);
                i += 1;
            }
        }
    }

    Card07 pick(int index) {
        return cardList[index];
    }
    Card07 pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardList.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card07 temp = cardList[i];
            cardList[i] = cardList[r];
            cardList[r] = temp;
        }
    }
}

class Card07 {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card07(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    Card07() {
        this(SPADE, 1);
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String number = "0A23456789XJQK";
        return kinds[this.kind] + " " + number.charAt(this.number);
    }
}

public class OOP2_07 {
    static void captionTv07Test() {
        CaptionTv07 cap01 = new CaptionTv07();
        cap01.channel = 9;
        cap01.volume = 10;
        cap01.channelUp();
        System.out.println(cap01.channel);
        cap01.displayCaption("Caption Off : Hello World!");
        cap01.caption = true;
        cap01.displayCaption("Caption On : Hello World!");
    }

    static void drawShape() {
        Point[] p = new Point[3];
        p[0] = new Point(80, 80);
        p[1] = new Point(20, 20);
        p[2] = new Point(140, 20);

        Triangle triangle01 = new Triangle(p);
        Circle circle01 = new Circle(new Point(50, 50), 50);

        triangle01.draw();
        circle01.draw();
    }

    static void deckTest() {
        Deck07 d = new Deck07();
        Card07 c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }

    public static void main(String[] args) {
//        captionTv07Test();
//        drawShape();
//        deckTest();
    }
}

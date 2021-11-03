package First;

import java.util.Objects;

class Circle02 implements Cloneable {
    Point02 center;
    double radius;

    Circle02 (Point02 center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle02 shallowCopy() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException cloneException) {
            cloneException.printStackTrace();
        }
        return (Circle02)object;
    }

    public Circle02 deepCopy() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException cloneException) {
            cloneException.printStackTrace();
        }
        Circle02 newCircle = (Circle02)object;
        Objects.requireNonNull(newCircle).center = new Point02(this.center.x, this.center.y);

        return newCircle;
    }

    public String toString() {
        return "center = " + center + " / " + "radius = " + radius;
    }
}

class Point02 {
    int x, y;

    Point02(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x + ", " + y;
    }
}

public class Copy {
    public static void main(String[] args) {
        Circle02 circle01 = new Circle02(new Point02(1, 1), 2.5);
        Circle02 circle02 = circle01.shallowCopy();
        Circle02 circle03 = circle01.deepCopy();

        System.out.println("circle01 / " + circle01);
        System.out.println("circle02 / " + circle02);
        System.out.println("circle03 / " + circle03);

        circle01.center.x = 9;
        circle01.center.y = 9;

        System.out.println("-------------- Change circle01 ----------------" );
        System.out.println("circle01 / " + circle01);
        System.out.println("circle02 / " + circle02);
        System.out.println("circle03 / " + circle03);
    }
}

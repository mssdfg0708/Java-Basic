class Outer {
    static int sv = 999;

    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}

class Outer01 {
    int value = 10;

    class Inner01 {
        int value = 20;

        void innerMethod() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer01.this.value);
            System.out.println(Outer.sv);
        }
    }
}

public class InnerEx {
    class InstanceInner {
        int iv = 100;
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    static void myMethod() {
        class LocalInner {
            int iv = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);

        Outer outer = new Outer();
        Outer.InstanceInner instanceInner = outer.new InstanceInner();

        System.out.println("instanceInner.iv : " + instanceInner.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("staticInner.iv : " + staticInner.iv);

        Outer01 outer01 = new Outer01();
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.innerMethod();
    }
}

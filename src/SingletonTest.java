final class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("New Singleton Object!");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

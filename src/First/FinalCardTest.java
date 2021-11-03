package First;

class Card01 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card01(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }
    Card01() {
        this("HEART", 7);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card01 c = new Card01();
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

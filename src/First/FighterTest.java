package First;

class Unit {
    int curHP;
    int x;
    int y;
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {

    }

    public void attack(Unit unit) {

    }
}

interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit unit); }
interface Fightable extends Movable, Attackable { }

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        if (fighter instanceof Unit) {
            System.out.println("Instance of First.Unit");
        }
        if (fighter instanceof Fightable) {
            System.out.println("Instance of First.Fightable");
        }
        if (fighter instanceof Attackable) {
            System.out.println("Instance of First.Attackable");
        }
        if (fighter instanceof Movable) {
            System.out.println("Instance of First.Movable");
        }
        if (fighter instanceof Object) {
            System.out.println("Instance of Object");
        }
    }
}

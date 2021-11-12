package Second;

enum Direction {
    EAST(1, "East"), SOUTH(2, "South"), WEST(3, "West"), NORTH(4, "North");

    private static final Direction[] DIRECTIONS = Direction.values();
    private final int value;
    private final String symbol;

    Direction(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }

    public static Direction of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return DIRECTIONS[dir - 1];
    }

    public Direction rotate(int num) {
        num = num / 90;
        num = num % 4;
        if (num < 0)
            num += 4;
        return DIRECTIONS[(value - 1 + num) % 4];
    }

    public String ToString() {
        return name() + getSymbol();
    }
}

public class EnumEx01 {
    public static void main(String[] args) {
        final int EAST = 1;
        final int SOUTH = 2;
        final int WEST = 3;
        final int NORTH = 4;

        for (Direction direction : Direction.values())
            System.out.printf("%s = %d \n", direction.name(), direction.getValue());

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(NORTH);

        System.out.printf("d1 = %s %s \n", d1.name(), d1.getSymbol());
        System.out.printf("d2 = %s %s \n", d2.name(), d2.getSymbol());

        System.out.println(Direction.EAST.rotate(90));
        System.out.println(Direction.EAST.rotate(180));
        System.out.println(Direction.EAST.rotate(270));
        System.out.println(Direction.EAST.rotate(360));
    }
}

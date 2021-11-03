package First;

public class ExceptionEx03 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        try {
            System.out.println("3");
            System.out.println(10/0);
            System.out.println("4");
        } catch (ArithmeticException arException) {
            if (arException instanceof ArithmeticException) {
                arException.printStackTrace();
                System.out.println("getMessage : " + arException.getMessage());
                System.out.println("getCause : " + arException.getCause());
            }
            System.out.println("ArithmeticException");
        } catch (Exception exception) {
            System.out.println("Another Exception");
        }
        System.out.println("5");
    }
}

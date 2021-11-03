package First;

public class ExceptionEx09 {
    static void throw01() throws Exception{
        throw02();
    }

    static void throw02() throws Exception{
        throw new Exception("Exception by throw02!");
    }

    public static void main(String[] args) {
        try {
            throw01();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

        try {
            throw new Exception("Intent Exception!");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Program Finished!");
    }
}

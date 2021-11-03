package First;

class SpaceException extends Exception {
    SpaceException (String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException (String msg) {
        super(msg);
    }
}

public class NewExceptionTest {
    static void startInstall() throws SpaceException, MemoryException{
        System.out.println("Install Initiate");
        if (!checkSpace())
            throw new SpaceException("Check Space");
        if (!checkMemory())
            throw new MemoryException("Check Memory");
    }

    static void copyFiles() {
        System.out.println("First.Copy Files");
    }

    static void deleteTempFiles() {
        System.out.println("Delete Temp Files");
    }

    static boolean checkSpace() {
        return true;
    }

    static boolean checkMemory() {
        return true;
    }

    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            System.out.println("Install Success");
        } catch (SpaceException | MemoryException exception) {
            System.out.println("Install Failure");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }
}

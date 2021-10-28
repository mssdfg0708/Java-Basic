class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

public class ChainedException {
    static void install() throws InstallException{
        try {
            startInstall();
            copyFiles();
            System.out.println("Install Success");
        } catch (SpaceException | MemoryException exception) {
            System.out.println("Install Failure");
            InstallException installException = new InstallException("Install Stopped");
            installException.initCause(exception);
            throw installException;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException{
        System.out.println("Install Initiate");
        if (!checkSpace())
            throw new SpaceException("Check Space");
        if (!checkMemory())
            throw new MemoryException("Check Memory");
    }

    static void copyFiles() {
        System.out.println("Copy Files");
    }

    static void deleteTempFiles() {
        System.out.println("Delete Temp Files");
    }

    static boolean checkSpace() {
        return true;
    }

    static boolean checkMemory() {
        return false;
    }

    public static void main(String[] args) {
        try {
            install();
        } catch (Exception installException) {
            installException.printStackTrace();
        }
    }
}

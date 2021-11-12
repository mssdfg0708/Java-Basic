package Second;

import javax.swing.JOptionPane;

class Run01 implements Runnable {
    @Override
    public void run() {
        String input = JOptionPane.showInputDialog("Input");
        System.out.println("Input : " + input);
    }
}

class DaemonRun implements Runnable {
    @Override
    public void run() {
        long stratTime = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) { }
            long Time = System.currentTimeMillis();
            long timer = (Time - stratTime) / 1000;
            System.out.println("Daemon Timer : " + timer);
        }
    }
}

public class ThreadEx01 {
    static void nonThreadMethod() throws Exception {
        System.out.println("non Thread Method Initiated");
        String input = JOptionPane.showInputDialog("Input");
        System.out.println("Input : " + input);

        for (int i = 10; i >0; i--) {
            try {
                Thread.sleep(1000);
            } catch (Exception exception) { }
            System.out.println("Count Down : " + i);
        }
        System.out.println("non Thread Method Finished");
    }

    static void threadMethod() throws Exception {
        System.out.println("thread Method Initiated");
        Thread thread01 = new Thread(new Run01());
        thread01.start();

        for (int i = 10; i >0; i--) {
            try {
                Thread.sleep(1000);
            } catch (Exception exception) { }
            System.out.println("Count Down : " + i);
        }
        System.out.println("thread Method Finished");
    }

    static void startDaemon() throws Exception {
        System.out.println("Daemon Method Initiated");
        Thread daemonThread01 = new Thread(new DaemonRun());
        daemonThread01.setDaemon(true);
        daemonThread01.start();
    }

    public static void main(String[] args) throws Exception{
        startDaemon();
        nonThreadMethod();
        threadMethod();
    }
}

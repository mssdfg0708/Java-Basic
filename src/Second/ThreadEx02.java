package Second;

public class ThreadEx02 {
    public static void main(String[] args) {
        // extends Thread 가 아닌 implement Runnable 을 사용하면 "Cannot find symbol 'usedMemory' 에러가 발생한다
        // 아직 까지 해결 방법을 찾을 수 없어서 extends Thread 로 대체하여 사용했다
        GarbageCollectorEx garbageCollector = new GarbageCollectorEx();
        garbageCollector.setDaemon(true);
        garbageCollector.start();

        int requiredMemory = 0;
        for (int i = 0; i < 20; i++) {
            requiredMemory = (int)((Math.random() * 10) * 20);

            // extends Thread 가 아닌 implement Runnable 을 사용하면 "Cannot find symbol 'usedMemory' 에러가 발생한다
            // 아직 까지 해결 방법을 찾을 수 없어서 extends Thread 로 대체하여 사용했다
            if (garbageCollector.usedMemory > GarbageCollectorEx.MAX_MEMORY * 0.9)
                garbageCollector.interrupt();
            try {
                garbageCollector.join(100);
            } catch (InterruptedException interruptedException) { }

            garbageCollector.usedMemory += requiredMemory;
            System.out.println("Used Memory : " + garbageCollector.usedMemory);
        }
    }
}

// extends Thread 가 아닌 implement Runnable 을 사용하면 "Cannot find symbol 'usedMemory' 에러가 발생한다
// 아직 까지 해결 방법을 찾을 수 없어서 extends Thread 로 대체하여 사용했다
class GarbageCollectorEx extends Thread{
    final static int MAX_MEMORY = 1000;
    final static int second = 1000;
    int usedMemory = 0;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10 * second);
            } catch (InterruptedException interruptedException) {
                System.out.println("Awaken by interrupted()!");
            }
            garbageCollect();
            System.out.println("Garbage Collected! Free Memory : " + freeMemory());
        }
    }

    public void garbageCollect() {
        usedMemory -= 300;
        if (usedMemory < 0)
            usedMemory = 0;
    }

    public int totalMemory() { return MAX_MEMORY; }
    public int freeMemory() { return MAX_MEMORY - usedMemory; }
}

import java.util.concurrent.locks.*;

public class AdvancedDeadlock {
    private final ReentrantLock lockA = new ReentrantLock();
    private final ReentrantLock lockB = new ReentrantLock();

    public void method1() {
        lockA.lock();
        try {
            Thread.sleep(1000);
            lockB.lock(); 
        } catch (Exception e) {
            
        }
    }

    public void method2() {
        lockB.lock();
        try {
            Thread.sleep(1000);
            lockA.lock(); 
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        AdvancedDeadlock obj = new AdvancedDeadlock();
        new Thread(obj::method1).start();
        new Thread(obj::method2).start();
    }
}



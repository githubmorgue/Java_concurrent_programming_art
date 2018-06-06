package chapter08;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch允许一个或多个线程等待其他线程完成操作
 */
public class CountDownLatchTest {

    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(1);
            c.countDown();
            System.out.println(2);
            c.countDown();
        }).start();

        c.await();
        System.out.println("3");
    }

}

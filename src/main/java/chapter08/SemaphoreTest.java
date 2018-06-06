package chapter08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 控制并发线程数的Semaphore 信号量
 */
public class SemaphoreTest {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore s = new Semaphore(10); //最多10个线程获取到许可证

    public static void main(String[] args) {

        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(() -> {
                try {
                    s.acquire();  //获取到许可证
                    System.out.println("save data");
                    s.release();  //释放
                } catch (InterruptedException e) {
                }
            });
        }

        threadPool.shutdown();
    }
}

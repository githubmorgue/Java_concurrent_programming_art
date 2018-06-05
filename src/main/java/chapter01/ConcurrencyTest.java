package chapter01;

/**
 * 并发一定比串行快吗
 */
public class ConcurrencyTest {

    private static final long count = 100001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }


    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (int i = 0; i < count; i++) {
                a += 5;
            }

            System.out.println(a);
        });

        thread.start();
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }

        long time = System.currentTimeMillis() -start;
        thread.join();  //等到线程终止
        System.out.println("concurrency :" + time+"ms,b="+b);

    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=" + b + ",a=" + a);
    }

}

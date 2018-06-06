package chapter08;

import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier还提供了一个更高级的构造函数CyclicBarrir(int parties,Runnable barrierAction)
 * 用于在线程到达屏障时，优先执行barrierAction,方便处理更复杂的业务场景，
 */
public class CyclicBarrierTest2 {


    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                c.await();
            } catch (Exception e) {

            }
            System.out.println(1);
        }).start();

        try {
            c.await();
        } catch (Exception e) {

        }
        System.out.println(2);
    }

    static class A implements Runnable {

        @Override
        public void run() {
            System.out.println(3);
        }

    }

}

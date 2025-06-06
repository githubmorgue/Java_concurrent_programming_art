package chapter08;

import java.util.concurrent.CyclicBarrier;

/**
 * 
 * @author tengfei.fangtf
 * @version $Id: CyclicBarrierTest3.java, v 0.1 2015-8-1 上午12:09:37 tengfei.fangtf Exp $
 */
public class CyclicBarrierTest3 {

    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            try {
                c.await();
            } catch (Exception e) {
            }
        });
        thread.start();
        thread.interrupt();  //中断thread
        try {
            c.await();
        } catch (Exception e) {
            System.out.println(c.isBroken());
        }
    }
}

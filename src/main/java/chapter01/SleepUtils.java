package chapter01;

import java.util.concurrent.TimeUnit;

/**
 * 6-4
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);  //java concurrent下的工具类
        } catch (InterruptedException e) {
        }
    }
}

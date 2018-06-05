package chapter05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 5.1 Lock接口
 * 5-1
 */
public class LockUseCase {
    public void lock() {
        Lock lock = new ReentrantLock(); //重入锁
        lock.lock(); //获取锁
        try {
        } finally {
            lock.unlock();
        }
    }
}

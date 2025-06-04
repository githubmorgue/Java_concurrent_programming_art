package chapter04;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 3.5.3 锁内存语义的实现
 * 本文将借助ReentrantLock(重入锁)的源代码，来分析锁内存语义的具体实现机制
 */
class ReentrantLockExample {

    private int a = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void writer() {
        lock.lock(); //获取锁
        try {
            a++;
        } finally {
            lock.unlock(); //释放锁
        }
    }

    public void reader() {
        lock.lock(); //获取锁
        try {
            int i = a;
            //……
        } finally {
            lock.unlock(); //释放锁
        }
    }
}

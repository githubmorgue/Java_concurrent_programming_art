package chapter01;

/**
 * 4.3.1 volatile和synchronize关键字
 * 对于同步块的实现使用了 monitorenter 和 monitorexit 指令，而同步
 * 方法则是依靠方法修饰符上的 ACC_SYNCHRONIZED 来完成的
 */
public class Synchronized {
    public static void main(String[] args) {
        // 对Synchronized Class对象进行加锁
        synchronized (Synchronized.class) {

        }
        // 静态同步方法，对Synchronized Class对象进行加锁
        m();
    }

    public static synchronized void m() {
    }
}

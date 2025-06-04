package chapter04;

/**
 * 3.4 volatile的内存语义
 * 可见性：对一个volatile变量的读，总是能看到（任意线程）对这个volatile变量最后的写入
 * 原子性：对任意单个volatile变量的读/写具有原子性，但类似于volatile++这种复合操作不具备原子性
 */

class VolatileFeaturesExample {
    volatile long vl = 0L; //使用volatile声明64位的long型变量

    public void set(long l) {
        vl = l; //单个volatile变量的写
    }

    public void getAndIncrement() {
        vl++; //复合（多个）volatile变量的读/写
    }

    public long get() {
        return vl; //单个volatile变量的读
    }
}

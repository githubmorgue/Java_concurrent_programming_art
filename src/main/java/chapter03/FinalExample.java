package chapter03;

/**
 * 3.6.1 final 域 的重排序规则
 * 1. 在构造函数内对一个 f inal 域的写入，与随后把这个被构造对象的引用赋值给一个引用变量，这两个操作之间不能重排序
 * 2. 初次读一个包含 f inal 域的对象的引用，与随后初次读这个 f inal 域，这两个操作之间不能重排序
 */
public class FinalExample {
    private int i;  //普通变量
    private final int j;  //final变量
    private static FinalExample obj;

    public FinalExample() { //构造函数
        i = 1; //写普通域
        j = 2; //写final域
    }

    public static void writer() { //写线程A执行
        obj = new FinalExample();
    }

    public static void reader() { //读线程B执行
        FinalExample object = obj; //读对象引用
        int a = object.i; //读普通域
        int b = object.j; //读final域
    }
}

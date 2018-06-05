package chapter03;

/**
 * 3.2.4 重排序对多线程的影响
 */
public class ReorderExample {
    int a = 0;
    boolean flag = false;

    public void writer(){
        a = 1;
        flag = true;
    }

    public void reader(){
        if (flag){
            int i = a*a;
        }
    }
}

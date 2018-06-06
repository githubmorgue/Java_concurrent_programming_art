package chapter08;

/**
 * 
 * 简单的使用Join方法，等待其他线程结束
 */
public class JoinCountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        Thread parser1 = new Thread(()-> {
            System.out.println("parser1 finish");
        });


        Thread parser2 = new Thread(() -> System.out.println("parser2 finish"));

        parser1.start();
        parser2.start();
        parser1.join();
        parser2.join();
        System.out.println("all parser finish");
    }

}

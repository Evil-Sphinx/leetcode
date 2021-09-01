import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author sphinx
 * @date 2021/8/25
 * @description
 */
public class VolatileTest {

    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static volatile boolean start = false;
    private static int i = 0;

    @Test
    public void test1() throws InterruptedException {
        new Thread(() -> {

            while (!started.get()) {
                i++;
            }

            System.out.println(i);
        }).start();

        Thread.sleep(1000 * 2);

        started.getAndSet(true);

        System.out.println("main thread exit");

        Thread.sleep(1000 * 10);

    }


    @Test
    public void test2() throws InterruptedException {
        new Thread(() -> {

            while (!start) {
                i++;
            }

            System.out.println(i);
        }).start();

        Thread.sleep(1000 * 2);

        start = true;

        System.out.println("main thread exit");

        Thread.sleep(1000 * 10);

    }

}

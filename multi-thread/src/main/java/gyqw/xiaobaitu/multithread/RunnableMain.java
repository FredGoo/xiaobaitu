package gyqw.xiaobaitu.multithread;

import gyqw.xiaobaitu.multithread.model.MyRunnable;

/**
 * @author fred
 */
public class RunnableMain {
    public static void main(String[] args) {
        System.out.println("主线程ID:" + Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

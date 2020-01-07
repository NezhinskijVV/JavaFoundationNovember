package threads;

import java.util.Arrays;

public class ThreadsPractice {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.getCount();


        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }

        MyRunnableImpl myRunnable = new MyRunnableImpl();
        Thread myRunnableThread = new Thread(new MyRunnableImpl());
        myRunnable.getCount();
        myRunnableThread.start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Anonymous thread" + i);
            }
        }).start();

    }
}

//HW: Comparable
//
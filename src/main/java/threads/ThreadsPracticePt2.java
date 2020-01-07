package threads;

public class ThreadsPracticePt2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread 1: " + i);
//            }
            while (true){

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 2: " + i);
            }
        });
//        try {
//            t1.start();
////            t1.join();
//            t2.start();
////            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        t1.setDaemon(true);
        t1.start();
        t2.start();

        Object object  = new Object();
        try {
            object.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

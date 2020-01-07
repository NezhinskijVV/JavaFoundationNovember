package threads;

public class MyThread extends Thread {
    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCount() {
        return count;
    }
}
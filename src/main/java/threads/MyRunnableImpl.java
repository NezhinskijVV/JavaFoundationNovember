package threads;

public class MyRunnableImpl implements Runnable {
    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnableThread: " + i);
        }
    }
}

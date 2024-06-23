class NumberPrinter implements Runnable {
    private int start, end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " printed by " + Thread.currentThread().getName());
        }
    }
}

public class multhr
{
    public static void main(String[] args) {
        int mid = 5000 / 2;
        Thread thread1 = new Thread(new NumberPrinter(1, mid), "Thread 1");
        Thread thread2 = new Thread(new NumberPrinter(mid + 1, 5000), "Thread 2");
        thread1.start();
        thread2.start();
    }
}
class np extends Thread {
    private int start, end;

    public np(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " printed by " + Thread.currentThread().getName());
        }
    }
}

public class multith {
    public static void main(String[] args) {
        int mid = 10/ 2;
        np thread1 = new np(1, mid);
        np thread2 = new np(mid + 1, 200);
        thread1.start();
        thread2.start();
    }
}
class NumberPrinter implements Runnable 
{
    public void run() 
    {
        for (int i = 1; i <= 5000; i++) 
        {
            System.out.println(i);
        }
    }
}

class AlphabetPrinter implements Runnable 
{
    public void run() 
    {
        for (char c = 'A'; c <= 'Z'; c++) 
        {
            System.out.println(c);
        }
    }
}

public class thp 
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new NumberPrinter());
        Thread thread2 = new Thread(new AlphabetPrinter());
        thread1.start();
        thread2.start();
    }
}
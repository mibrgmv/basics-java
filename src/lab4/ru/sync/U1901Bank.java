package lab4.ru.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("0. intTo: " + intTo + ", intFrom: " + intFrom + ", Thread: " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return;
        }
        intTo += intTransaction;
        System.out.println("1. intTo: " + intTo + ", intFrom: " + intFrom + ", Thread: " + Thread.currentThread().getName());
    }
}

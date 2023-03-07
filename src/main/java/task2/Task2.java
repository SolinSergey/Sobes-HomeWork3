package task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task2 {
    static Lock lock=new ReentrantLock();
    public static void main(String[] args) {
        MyThread myThread1=new MyThread("Поток 1",lock);
        MyThread myThread2=new MyThread("Поток 2",lock);
        myThread1.start();
        myThread2.start();
    }
}

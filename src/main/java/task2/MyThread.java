package task2;

import java.util.concurrent.locks.Lock;

public class MyThread extends Thread {
    static int count;
    Lock lock;
    String name;

    public MyThread(String name,Lock lock) {
        this.lock=lock;
        this.name=name;
        System.out.println(name + " запустился");
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
            count++;
            System.out.println(name+" захватил счетчик");
            System.out.println(name + " "+count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" освободил счетчик");
            lock.unlock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


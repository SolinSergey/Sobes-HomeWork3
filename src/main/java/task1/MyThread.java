package task1;

import java.util.Random;

public class MyThread extends Thread {
    Object object;
    String name;

    public MyThread(Object object, String name) {
        this.object = object;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (object) {
            while (true){
                System.out.println(name);
                try {
                    Thread.sleep(new Random(System.currentTimeMillis()).nextInt(2000));
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
}

package task1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread myThread1=new MyThread(object,"Поток1 - Ping");
        MyThread myThread2=new MyThread(object,"Поток2 - Pong");
        myThread1.start();
        myThread2.start();
    }
}

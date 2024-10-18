package ru.vasilev;

public class App {
    public static void main(String[] args ){
        BlockingQueue blockingQueue = new BlockingQueue(4);

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
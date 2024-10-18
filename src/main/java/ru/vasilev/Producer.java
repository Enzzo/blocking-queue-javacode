package ru.vasilev;

import static java.lang.Thread.sleep;

public class Producer implements Runnable{
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; ++i) {
            queue.enqueue(new SharedSource(String.valueOf(i)));
            System.out.println("source: #" + i);
        }
    }
}
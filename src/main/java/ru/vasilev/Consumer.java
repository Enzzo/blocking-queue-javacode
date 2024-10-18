package ru.vasilev;

import static java.lang.Thread.sleep;

public class Consumer implements Runnable{
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                sleep(100);
            }catch(InterruptedException ignore){}
            System.out.println("Release: " + queue.dequeue().toString());
        }
    }
}
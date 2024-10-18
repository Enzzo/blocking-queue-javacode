package ru.vasilev;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BlockingQueue {

    private Queue queue = new LinkedList<SharedSource>();
    private int maxSize;

    public BlockingQueue(int maxSize){
        this.maxSize=maxSize;
    }

    public synchronized void enqueue(SharedSource income){
        while(queue.size() >= maxSize) {
            try {
                wait();
            }catch(InterruptedException ignore){}

        }
        queue.add(income);
        notify();
    }

    public synchronized SharedSource dequeue(){
        while(queue.isEmpty()){
            try {
                wait();
            }catch(InterruptedException ignore){}
        }
        SharedSource released = (SharedSource)queue.poll();
        notify();
        return released;
    }

    public int size(){
        return queue.size();
    }
}
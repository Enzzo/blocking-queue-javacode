package ru.vasilev;

import java.util.PriorityQueue;
import java.util.Queue;

public class BlockingQueue {

    private Queue queue = new PriorityQueue<>();

    public Integer size(){
        return queue.size();
    }
}
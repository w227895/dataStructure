package com.kebo.queue;

/**
 * @description: 队列接口
 * @author: kb
 * @create: 2019-08-04 16:44
 **/
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    //入队
    void enqueue(E e);
    //出队
    E dequeue();
    //获取队首元素
    E getFront();

}


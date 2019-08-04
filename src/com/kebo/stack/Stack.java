package com.kebo.stack;

/**
 * @description: 栈接口
 * @author: kb
 * @create: 2019-08-04 16:25
 **/
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}


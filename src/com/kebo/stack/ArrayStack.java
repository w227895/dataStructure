package com.kebo.stack;

import com.kebo.array.Array;

/**
 * @description: 栈数组实现
 * @author: kb
 * @create: 2019-08-04 16:26
 **/
public class ArrayStack<E>  implements Stack<E> {
    Array<E> array;

    public ArrayStack(int capacity){
        array= new Array<E>(capacity);
    }

    public ArrayStack(){
        array=new Array<E>(10);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //入栈
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    //出栈
    @Override
    public E pop() {
        return array.removeLast();
    }

    //返回栈顶元素
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}


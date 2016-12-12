/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

import Prob3.*;

public class Stack implements StackADT {

    private Object stackArray[];
    private int top;

    public Stack(int maxSize) {
        stackArray = new Object[maxSize];
        top = -1;
    }

    public Stack() {
        this(100); // maxSize is 100, by default
    }

    public void push(Object o)
            throws StackFullException {
        if (size() == stackArray.length) {
            throw new StackFullException("Stack is full.");
        }
        stackArray[++top] = o;
    }

    public Object pop()
            throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return stackArray[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public Object top()
            throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return stackArray[top];
    }

    public Object[] multiPop(int k)
            throws StackEmptyException, IllegalArgumentException {
        if (k < 0) {
            throw new IllegalArgumentException(
                    "The number of items to be popped is negative");
        }
        Object[] output = new Object[k];
        int index = 0;
        while (k > 0) {
            if (isEmpty()) {
                throw new StackEmptyException("Empty");
            }
            output[index++] = pop();
            k--;
        }
        return output;
    }

}

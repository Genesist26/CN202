/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob6;

/**
 *
 * @author somsa
 */
public class Stack implements StackADT {

    private int[] stackArray;
    private int[] stackMaxArray;
    private int top;

    public Stack(int maxSize) {
        stackArray = new int[maxSize];
        stackMaxArray = new int[maxSize];
        top = -1;
    }

    public Stack() {
        this(100);
    }

    public void push(int item) {
        if (size() == stackArray.length) {
            throw new StackFullException("Stack is full.");
        }

        top = top + 1;
        stackArray[top] = item;
        if (top == 1) {
            stackMaxArray[top] = item;
        } else if (stackArray[top] >= stackMaxArray[top]) {
            stackMaxArray[top] = item;
        }

    }

    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }

        int x = stackArray[top];
        top = top - 1;
        return x;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return stackArray[top];
    }

    public int max() throws StackEmptyException {
        return stackMaxArray[top];
    }

}

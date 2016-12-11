/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

/**
 *
 * @author somsa
 */
public class Queue implements QueueADT {

    private Object[] qArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        qArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public Queue() {
        this(100);
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    private boolean isFull() {
        return (nItems == qArray.length);
    }

    public void insert(Object newItem) {
        if (isFull()) {
            throw new QueueFullException("Queue is full.");
        }
        rear = (rear + 1) % qArray.length;
        qArray[rear] = newItem;
        nItems++;
    }

    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        Object temp = qArray[front];
        front = (front + 1) % qArray.length;
        nItems--;
        return temp;
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return qArray[front];
    }
}

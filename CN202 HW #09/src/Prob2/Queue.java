/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

/**
 *
 * @author Salee
 */
public class Queue implements QueueADT {

    private int front;
    private int rear;
    private int nItems;
    private Object[] a;

    public Queue(int max) {
        a = new Object[max];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public Queue() {
        this(100);
    }

    public void insert(Object o) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is full.");
        }
        if (rear == (a.length - 1)) {
            // rear index reaches the end of a
            // move all items to the front of a 
            for (int i = front; i <= rear; i++) {
                a[i - front] = a[i];
            }
            front = 0;
            rear = nItems - 1;
        }
        a[++rear] = o;
        nItems++;
    }

    private boolean isFull() {
        return (nItems == a.length);
    }

    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is emtpy");
        }

        Object temp = a[front];
        a[front++] = null;
        if (front == a.length - 1) {
            front = 0;
        }

        return temp;

    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return a[front];
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop1;

/**
 *
 * @author NALINA
 */
public class Queue implements QueueADT {

    private Object[] queueArray;
    private int nItems;

    public Queue(int maxSize) {
        queueArray = new Object[maxSize];
        nItems = -1;
    }

    @Override
    public void insert(Object o) {
        if (size() == queueArray.length) {
            throw new QueueFullException("Queue is full.");
        }
        nItems++;
        for (int i = nItems; i > 0; i--) {
            queueArray[i] = queueArray[i - 1];
        }
        queueArray[0] = o;
    }

    @Override
    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        Object temp = queueArray[0];
        for (int i = 0; i < nItems; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        return temp;
    }

    @Override
    public int size() {
        return nItems + 1;
    }

    @Override
    public boolean isEmpty() {
        return nItems == -1;
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return queueArray[0];
    }

}

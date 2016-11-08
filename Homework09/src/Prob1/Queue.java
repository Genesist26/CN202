package Prob1;

public class Queue implements QueueADT {

    private Object[] queueArray;
    private int nItems;

    public Queue(int maxSize) {
        queueArray = new Object[maxSize];
        nItems = -1;
    }

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

    public int size() {
        return nItems + 1;
    }

    public boolean isEmpty() {
        return nItems == -1;
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return queueArray[0];
    }

}

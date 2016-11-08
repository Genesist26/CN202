package Prob3;

public class Queue implements QueueADT {

    private Object[] queueArray;
    private int nItems;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        queueArray = new Object[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public Queue() {
        this(100);
    }

    public void insert(Object o) {
        if (size() == queueArray.length) {
            throw new QueueFullException("Queue is full.");
        }
        if (rear == (queueArray.length - 1)) {
            rear = 0;
        } else {
            rear++;
        }
        queueArray[rear] = o;
        nItems++;
    }

    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        Object temp = queueArray[front];
        front = (front + 1) % queueArray.length;
        nItems--;
        return temp;
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return queueArray[front];

    }

    public void reverseQueue() {
        int last = rear;
        for (int i = 0; i < nItems; i++) {
            queueArray[i] = queueArray[last--];
        }

        /*
        Object[] revers = new Object[queueArray.length];
        int f = front;
        int r  = rear;
        for(int i = 1; i<=nItems; i++){
            Object temp = queueArray[r];
            revers[f] =  temp;
            r--;
            f++;
        }
        queueArray = revers;
         */
    }

}

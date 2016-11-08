package Prob4;

public class Queue implements QueueADT {

    private int[] queueArray;
    private int nItems;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        queueArray = new int[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public Queue() {
        this(100);
    }

    public void insert(int o) {
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

    public int remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        int temp = queueArray[front];
        front = (front + 1) % queueArray.length;
        nItems--;
        return temp;
    }

    public int front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return queueArray[front];

    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void replaceInQueue(int thisOne, int thatOne) {

        for (int i = 0; i < nItems; i++) {
            if (queueArray[i] == thisOne) {
                queueArray[i] = thatOne;
            }
        }
        /*
        int r = front;
        for (int i = 0; i < nItems; i++) {
            int a = ((Integer) queueArray[r]).intValue();
            if (a == thisOne) {
                queueArray[r] = (Object) thatOne;
                break;
            }
            r++;
        }
         */
    }

}

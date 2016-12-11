package Pron1;

public class Queue implements QueueADT {

    private Object[] a;
    private int rear;
    public int nItem;

    public Queue(int max) {
        a = new Object[max];
        nItem = 0;
        rear = -1;
    }

    public Queue() {
        this(100);
    }

    public int size() {
        return nItem;
    }

    private boolean isFull() {
        return (nItem == a.length);
    }

    public void insert(Object o) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Queue is full.");
        }
        a[++rear] = o;
        nItem++;
    }

    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        Object frontItem = a[0];
        for (int i = 1; i < size(); i++) {
            a[i - 1] = a[i];
        }
        nItem--;
        rear--;
        return frontItem;
    }

    public boolean isEmpty() {
        return (nItem == 0);
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return a[0];
    }

}

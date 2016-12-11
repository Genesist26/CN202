package Prob3;

public class Queue implements QueueADT {
    // instance variables

    private Object[] queArray;
    private int nItems;
    private int front;
    private int rear;

    // constructor
    public Queue(int maxSize) {
        queArray = new Object[maxSize];
        nItems = 0;
        front = 0;
        rear = -1;
    }

    public Queue() {
        this(100);
    }

    // methods
    public void insert(Object o) throws QueueFullException {
        if (nItems == queArray.length) {
            throw new QueueFullException("Queue is full");
        }
        rear = (rear + 1) % queArray.length;
        queArray[rear] = o;
        nItems++;
    }

    public Object remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        Object temp = queArray[front];
        front = (front + 1) % queArray.length;
        nItems--;
        return temp;
    }

    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return queArray[front];
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void reverseQueue() {
        Stack stack = new Stack();
        while(!isEmpty())
        {
            stack.push(remove());
        }
        
        while(!stack.isEmpty())
        {
            this.insert(stack.pop());
        }
        
    }
    
    public void display()
    {
        
    }
}

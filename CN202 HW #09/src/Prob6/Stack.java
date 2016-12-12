package Prob6;

public class Stack implements StackADT {

    private Node top;
    private int nItems;
    private int max;

    public void push(int item) {
        Node newNode = new Node(item, top);
        if (isEmpty()) {
            max = newNode.getItem();
        }
        if (item > max) {
            max = item;
        }
        top = newNode;
        nItems++;
    }

    public int pop() throws StackEmptyException {
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        int temp = top.getItem();
        if(size() == 1)
            top = null;
        else
            top = top.getNext();
        nItems--;
        return temp;
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public int top() throws StackEmptyException {
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");

        return top.getItem();
    }
    
    public int max() throws StackEmptyException
    {
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        
        return max;
    }
}

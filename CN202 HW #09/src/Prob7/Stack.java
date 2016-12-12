package Prob7;

public class Stack implements StackADT {
    // instance variables

    private Node top;
    private int numElem;
    // constructor

    public Stack() {
        top = null;
        numElem = 0;
    }
    // methods

    public int size() {
        return numElem;
    }

    public boolean isEmpty() {
        return (numElem == 0);
    }

    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return top.getElement();
    }

    public void push(Object elem) {
        Node newNode = new Node(elem, top);
        top = newNode;
        numElem++;
    }

    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        Object temp = top.getElement();
        top = top.getNext();
        numElem--;
        return temp;
    }
}

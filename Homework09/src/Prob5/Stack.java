package Prob5;

public class Stack implements StackADT {

    private Object[] stackArray;
    private int top;

    public Stack(int maxSize) {
        stackArray = new Object[maxSize];
        top = -1;

    }

    public Stack() {
        this(100);
    }

    public void push(Object o) throws StackFullException {
        if (size() == stackArray.length) {
            throw new StackFullException("Stack is full.");
        }

        top = top + 1;
        stackArray[top] = o;
    }

    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }

        Object x = stackArray[top];
        top = top - 1;
        return x;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (size() == 0);

    }

    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return stackArray[top];
    }

    public static Stack stackify(Queue q) {
        Stack s = new Stack();
        if (q.isEmpty()) {
            return s;
        } else if (q == null) {
            return null;
        } else {
            for (int i = 0; i < q.size(); i++) {
                s.push(q.remove());
            }
            return s;
        }

    }

}

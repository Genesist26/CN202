package Solution06;

public class Stack implements StackADT {

    private int[] stackArray;
    private int[] stackMaxArray;
    private int top;
    private int max; // keep index of max value

    public Stack(int max) {
        stackArray = new int[max];
        stackMaxArray = new int[max];
        top = -1;
    }

    public void push(int item) {
        stackArray[++top] = item;
        if(top == 1)
            max = stackArray[top];
        else if(item > max)
            stackMaxArray[top] = item;
        else if(item < max)
            stackMaxArray[top] = max;
    }

    public int pop() throws StackEmptyException {
        return stackArray[top--];
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int top() throws StackEmptyException {
        return stackArray[top];
    }

    public int max() throws StackEmptyException {
        return max;
    }

}

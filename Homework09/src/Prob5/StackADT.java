package Prob5;

public interface StackADT {

    public void push(Object netItem);

    public Object pop() throws StackEmptyException;

    public int size();

    public boolean isEmpty();

    public Object top() throws StackEmptyException;

}

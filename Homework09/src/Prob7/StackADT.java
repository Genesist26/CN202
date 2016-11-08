
package Prob7;

public interface StackADT {
    public int size();
    public boolean isEmpty();
    public Object top() throws StackEmptyException;
    public void push(Object e);
    public Object pop() throws StackEmptyException;
}

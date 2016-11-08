package Prob2;

public interface StackADT {

    public void push(int item); // ItemทีÉเก็บอยู่ในโครงสร้าง Stack เป็นเลขจาํ นวนเตม็

    public int pop() throws StackEmptyException;

    public int size();

    public boolean isEmpty();

    public int top() throws StackEmptyException;

    public int max() throws StackEmptyException;
}

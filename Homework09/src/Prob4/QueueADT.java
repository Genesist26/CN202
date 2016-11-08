package Prob4;

public interface QueueADT {

    public void insert(int o);

    public int remove() throws QueueEmptyException;

    public int front() throws QueueEmptyException;

    public int size();

    public boolean isEmpty();

    public void replaceInQueue(int thisOne, int thatOne);
}

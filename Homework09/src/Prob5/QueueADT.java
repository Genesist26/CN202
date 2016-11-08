package Prob5;

public interface QueueADT {

    public void insert(Object o);

    public Object remove() throws QueueEmptyException;

    public Object front() throws QueueEmptyException;

    public int size();

    public boolean isEmpty();

}

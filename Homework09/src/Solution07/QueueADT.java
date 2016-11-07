package Solution07;

public interface QueueADT {

    public int size();

    public boolean isEmpty();

    public Object front() throws QueueEmptyException;

    public void insert(Object element);

    public Object remove() throws QueueEmptyException;
}

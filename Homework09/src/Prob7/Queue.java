
package Prob7;

public class Queue implements QueueADT
{
  private Stack elemStack;
  private Stack tempStack;

  public Queue()
  {
    elemStack = new Stack();
    tempStack = new Stack();
  }
  public int size()
  {
    return elemStack.size();
  }
  public boolean isEmpty()
  {
    return elemStack.isEmpty();
  }
  public Object front() throws QueueEmptyException
  {
    if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    while (!elemStack.isEmpty())
      tempStack.push(elemStack.pop());
    Object frontElem = tempStack.top();
    while (!tempStack.isEmpty())
      elemStack.push(tempStack.pop());
    return frontElem;
  }
  public void insert(Object element)
  {
    elemStack.push(element);
  }
  public Object remove() throws QueueEmptyException
  {
    if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    while (!elemStack.isEmpty())
      tempStack.push(elemStack.pop());
    Object frontElem = tempStack.pop();
    while (!tempStack.isEmpty())
      elemStack.push(tempStack.pop());
    return frontElem;
  }
}
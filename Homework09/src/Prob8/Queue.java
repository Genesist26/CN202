
package Prob8;

public class Queue implements QueueADT
{
  private SNode front;
  private SNode rear;
  private int nItems;

  public Queue()
  { front = null; rear = null; nItems = 0;
  }
  public void insert(Object o)
  { SNode newNode = new SNode(o, null);
    if (isEmpty())
      front = newNode;
    else
      rear.setNext(newNode);
    rear = newNode;
    nItems++;
  }
  public int size()
  { return nItems;
  }
  public boolean isEmpty()
  { return (nItems == 0);
  }
  public Object remove() throws QueueEmptyException
  { if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    SNode temp = front;
    if (front.getNext() == null)
      rear = null;
    front = front.getNext();
    nItems--;
    return temp.getElem(); 
  }
  public Object front() throws QueueEmptyException
  { if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    return front.getElem();   
  }
}
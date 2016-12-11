/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4.Designer;

/**
 *
 * @author somsa
 */
public class Queue implements QueueADT
{
  // instance variables
  private Object[] item;
  private int nItems;
  private int rear; // front is always at index 0

  // constructors
  public Queue(int maxSize)
  {
    item = new Object[maxSize];
    rear = -1;
    nItems = 0;
  }
  public Queue()
  {
    this(100); // maxSize = 100, by default
  }
  // methods
  public int size()
  { return nItems; }
  private boolean isFull()
  { return (nItems == item.length); }
  public void insert(Object o) throws QueueFullException
  {
    if (isFull())
      throw new QueueFullException("Queue is full."); 
    item[++rear] = o;
    nItems++;
  }
  public Object remove() throws QueueEmptyException
  {
    if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    Object frontItem = item[0];
    for (int i=1; i<size(); i++)
      item[i-1] = item[i];
    nItems--;
    rear--;
    return frontItem;
  }
  public boolean isEmpty()
  { return (nItems == 0); }
  public Object front() throws QueueEmptyException
  {
    if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    return item[0];
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

/**
 *
 * @author somsa
 */
public class Stack implements StackADT
{
  private Object stackArray[];
  private int top;

  public Stack(int maxSize)
  {
    stackArray = new Object[maxSize];
    top = -1;
  }
  public Stack()
  {
    this(100); // maxSize is 100, by default
  }
  public void push(Object o)
    throws StackFullException
  {
    if (size() == stackArray.length)
     throw new StackFullException("Stack is full.");
    stackArray[++top] = o;
  }
  public Object pop()
    throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top--];
  }
  public int size()
  {
    return top+1;
  }
  public boolean isEmpty()
  {
    return (size() == 0);
  }
  public Object top()
    throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top];
  }
}

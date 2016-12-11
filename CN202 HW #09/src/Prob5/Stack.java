/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

/**
 *
 * @author somsa
 */
public class Stack implements StackADT
{
  private Object[] stackArray;
  private int top;

  public Stack(int maxSize) { stackArray = new Object[maxSize]; top = -1; }

  public Stack() { this(100); }

  public int size() { return (top+1); }

  public boolean isEmpty() { return (size() == 0); }

  private boolean isFull() { return (size() == stackArray.length); }

  public void push(Object newItem)
  {  if (isFull())
        throw new StackFullException("Stack is full.");
     stackArray[++top] = newItem;
    
  }

  public Object pop() throws StackEmptyException
  {  if (isEmpty())
        throw new StackEmptyException("Stack is empty.");
     return stackArray[top--];
  }

  public Object top() throws StackEmptyException
  {  if (isEmpty())
        throw new StackEmptyException("Stack is empty.");
     return stackArray[top];
  }
}

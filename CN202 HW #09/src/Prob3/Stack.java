/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

/**
 *
 * @author Salee
 */
public class Stack implements StackADT
{
  // instance variables
  private Object[] stackArray;
  private int top;

  // constructor
  public Stack(int maxSize)
  { stackArray = new Object[maxSize];
    top = -1;
  }

  public Stack()
  { this(100); }

  // methods
  public void push(Object o) throws StackFullException
  { if (top == stackArray.length)
      throw new StackFullException("Stack is full");
    stackArray[++top] = o;
  }

  public Object pop() throws StackEmptyException
  {
    if (top == -1)
      throw new StackEmptyException("Stack is empty.");
    return stackArray[top--];
  }

  public int size()
  { return (top+1); }

  public boolean isEmpty()
  { return (top == -1); }

  public Object top() throws StackEmptyException
  { return stackArray[top]; }
}

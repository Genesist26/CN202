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
public interface StackADT
{
  public void push(Object o);
  public Object pop() throws StackEmptyException;
  public int size();
  public boolean isEmpty();
  public Object top() throws StackEmptyException;
}

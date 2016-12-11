/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author Salee
 */
public interface QueueADT
{
  public void insert(int o);
  public int remove() throws QueueEmptyException;
  public int front() throws QueueEmptyException;
  public int size();
  public boolean isEmpty();
  public void replaceInQueue(int thisItem, int thatItem);
}

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
public class QueueDataApp
{
  public static void main(String[] args)
  {
    Queue q = new Queue();
    Queue q2 = new Queue();

    q.insert(4);
    q.insert(7);
    q.insert(8);
    q.insert(3);
    q.insert(1);
    q.insert(2);
    q.insert(4);
    q.insert(7);
    q.insert(4);
    q.insert(4);
    q.insert(1);
    q.insert(2);

    while (!q.isEmpty())
    {
      int item = q.remove();
      System.out.print(item + " ");
      q2.insert(item);
    }
    System.out.println();
    q2.replaceInQueue(4, 99);
    while (!q2.isEmpty())
    {
      int item = q2.remove();
      System.out.print(item + " ");
    }
    System.out.println();
  }
}

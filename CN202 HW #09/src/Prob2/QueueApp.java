/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

/**
 *
 * @author Salee
 */
public class QueueApp
{
  public static void main(String[] args)
  {
    Queue theQueue = new Queue(5);
    theQueue.insert(new Integer(10));
    theQueue.insert(new Integer(20));
    theQueue.insert(new Integer(30));
    theQueue.insert(new Integer(40));

    theQueue.remove();
    theQueue.remove();
    theQueue.remove();

    theQueue.insert(new Integer(50));
    theQueue.insert(new Integer(60));
    theQueue.insert(new Integer(70));
    theQueue.insert(new Integer(80));

    while (!theQueue.isEmpty())
    {
      int n = ((Integer)theQueue.remove()).intValue();
      System.out.print(n + " ");
    }
    System.out.println();    
  }
}

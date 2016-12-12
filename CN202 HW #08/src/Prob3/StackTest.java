package Prob3;
public class StackTest
{
  public static void main(String[] args)
  {
    Stack s = new Stack();
    int i;
    for (i=0; i<10; i++)
      s.push(new Integer(i));
    Object[] x = s.multiPop(i);
    for (i=0; i<x.length; i++)
      System.out.print(x[i] + " ");
    System.out.println();

/* 
    Object[] x = s.multiPop(0);
    int i;
    System.out.println("length of array x = " + x.length);
    for (i=0; i<x.length; i++)
      System.out.print(x[i] + " ");
    System.out.println();
*/

  }
}
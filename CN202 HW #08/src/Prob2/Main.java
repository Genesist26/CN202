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
public class Main {
    public static void main(String[] args)
  {
    Stack A = new Stack();
    A.push(new Integer(5));
    A.push(new Integer(10));
    A.push(new Integer(17));
    A.push(new Integer(31));
    A.push(new Integer(50));
    A.push(new Integer(96));

    Stack B = new Stack();
    B.push(new Integer(24));
    B.push(new Integer(45));
    B.push(new Integer(63));
    B.push(new Integer(85));

    Stack C = merge(A,B);
    while (!C.isEmpty())
      System.out.print(((Integer)C.pop()).intValue() + " ");
    System.out.println();
  }
    
    public static Stack merge(Stack A, Stack B)
    {
        Stack C = new Stack();
        while(!A.isEmpty() && !B.isEmpty())
        {
            if(((Integer)A.top()).intValue() > ((Integer)B.top()).intValue())
                C.push(A.pop());
            else
                C.push(B.pop());
        }
        while(!A.isEmpty())
            C.push(A.pop());
        while(!B.isEmpty())
            C.push(B.pop());
        
        return C;
    }
}

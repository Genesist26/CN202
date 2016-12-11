/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob6;

/**
 *
 * @author somsa
 */
public class TestStack
{
  public static void main(String[] args)
  {
    Stack theStack = new Stack();
    theStack.push(10);
    theStack.push(20);
    theStack.push(20);
    theStack.push(20);
    theStack.push(90);
    theStack.push(60);
    theStack.push(30);
    theStack.push(20);
    
      System.out.println(theStack.max());
  }
}

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
public class SNode
{
  private int element;
  private SNode next;

  // constructor
  public SNode(int anElem, SNode aNext)
  { element = anElem; next = aNext; }
  // get-set methods
  public int getElem()
  { return element; }
  public SNode getNext()
  { return next; }
  public void setElement(int newElem)
  { element = newElem; }
  public void setNext(SNode newNext)
  { next = newNext; }
}

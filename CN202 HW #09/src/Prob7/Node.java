/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob7;

/**
 *
 * @author somsa
 */
public class Node
{
  // instance variables
  private Object element;
  private Node next;
  // constructors
  public Node() { this(null, null); }
  public Node(Object e, Node n) { element = e; next = n; }
  // get-set methods
  public Object getElement() { return element; }
  public Node getNext() { return next; }
  public void setElement(Object e) { element = e; }
  public void setNext(Node n) { next = n; }
}

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
public interface StackADT {
    public int size();
    public boolean isEmpty();
    public void push(Object o);
    public Object pop() throws StackEmptyException;
    public Object top() throws StackEmptyException;
}

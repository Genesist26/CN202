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
public interface StackADT {

    public int size();

    public boolean isEmpty();

    public Object top() throws StackEmptyException;

    public void push(Object e);

    public Object pop() throws StackEmptyException;
}

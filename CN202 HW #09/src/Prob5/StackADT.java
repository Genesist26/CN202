/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

public interface StackADT {

    public void push(Object newItem);

    public Object pop() throws StackEmptyException;

    public int size();

    public boolean isEmpty();

    public Object top() throws StackEmptyException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

public interface QueueADT {

    public void insert(Object newItem);

    public Object remove() throws QueueEmptyException;

    public Object front() throws QueueEmptyException;

    public int size();

    public boolean isEmpty();
}

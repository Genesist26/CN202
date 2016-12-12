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
public interface QueueADT {

    public int size();

    public boolean isEmpty();

    public Object front() throws QueueEmptyException;

    public void insert(Object element);

    public Object remove() throws QueueEmptyException;
}

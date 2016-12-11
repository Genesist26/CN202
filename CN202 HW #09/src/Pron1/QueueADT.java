/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pron1;

/**
 *
 * @author Salee
 */
public interface QueueADT {

    public void insert(Object o);

    public Object remove() throws QueueEmptyException;

    public int size();

    public boolean isEmpty();

    public Object front() throws QueueEmptyException;
}

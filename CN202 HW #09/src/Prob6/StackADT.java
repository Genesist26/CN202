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
public interface StackADT {

    public void push(int item); // Itemที􀃉เก็บอยู่ในโครงสร้าง Stack เป็ นเลขจำนวนเต็ม

    public int pop() throws StackEmptyException;

    public int size();

    public boolean isEmpty();

    public int top() throws StackEmptyException;

    public int max() throws StackEmptyException;
}

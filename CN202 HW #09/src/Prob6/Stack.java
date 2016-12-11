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
public class Stack implements StackADT {
    // instance variables

    private Node top;
    private int numItem;

    // constructor
    public Stack() {
        top = null;
        numItem = 0;
    }

    // methods
    public int size() {
        return numItem;
    }

    public boolean isEmpty() {
        return (numItem == 0);
    }

    public int top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return top.getItem();
    }

    public void push(int item) {
        int max;

        if ((top == null)
                || // first item on stack
                (item > top.getMaxItem())) // item is maximum
        {
            max = item;
        } else {
            max = top.getMaxItem();
        }
        Node newNode = new Node(item, max, top);
        top = newNode;
        numItem++;
    }

    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        int popItem = top.getItem();
        top = top.getNext();
        numItem--;
        return popItem;
    }

    
    public int max2() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }

        int max = top();
        Stack stack2 = new Stack();
        int pop;
        while (!isEmpty()) {
            pop = pop();
            if (pop > max) {
                max = pop;
            }
            
            stack2.push(pop);
        }
        while(!stack2.isEmpty()){
            push(pop());
        }
        
        return max;
    }
     

    public int max() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty.");
        }
        return top.getMaxItem();
    }

    public void printStack() {
        System.out.println("Items on stack");
        Node current = top;
        while (current != null) {
            System.out.println("item = " + current.getItem());
            System.out.println("max = " + current.getMaxItem());
            System.out.println();

            current = current.getNext();
        }
    }
}

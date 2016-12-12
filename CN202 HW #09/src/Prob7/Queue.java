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
public class Queue implements QueueADT {

    private Stack stack1;
    private Stack stack2;

    
    public Queue(){
        stack1 = new Stack();
        stack2 = new Stack();
    }
    @Override
    public int size() {
        return stack1.size();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (stack1.isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        Object front;
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        front = stack2.top();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return front;
    }

    @Override
    public void insert(Object element) {
        stack1.push(element);
    }

    @Override
    public Object remove() throws QueueEmptyException {
        if (stack1.isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        Object temp = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return temp;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob8;

/*


 */
public class Stack implements StackADT {

    private Queue qTemp;
    private Queue qStack;

    public Stack() {
        qTemp = new Queue();
        qStack = new Queue();
    }

    public int size() {
        return qStack.size();
    }

    public boolean isEmpty() {
        return qStack.isEmpty();
    }

    @Override
    public Object top() throws StackEmptyException {
        return qStack.front();
    }

    @Override
    public void push(Object element) {
        qTemp.insert(element);
        while(! qStack.isEmpty())
            qTemp.insert(qStack.remove());
        while(! qTemp.isEmpty())
            qStack.insert(qTemp.remove());
    }

    @Override
    public Object pop() throws StackEmptyException {
        return qStack.remove();
    }

}

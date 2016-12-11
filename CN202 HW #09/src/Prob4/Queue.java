/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author Salee
 */
public class Queue implements QueueADT {

    private SNode front;
    private SNode rear;
    private int nItems;

    public Queue() {
        front = null;
        rear = null;
        nItems = 0;
    }

    public void insert(int o) {
        SNode newNode = new SNode(o, null);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        nItems++;
    }

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int remove() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        SNode temp = front;
        if (front.getNext() == null) {
            rear = null;
        }
        front = front.getNext();
        nItems--;
        return temp.getElem();
    }

    public int front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty.");
        }
        return front.getElem();
    }

    public void replaceInQueue(int thisItem, int thatItem) {
        for(int i = 0; i<size();i++){
            int item = remove();
            if(item == thisItem)
                insert(thatItem);
            else
                insert(item);
        }
        
    }

}

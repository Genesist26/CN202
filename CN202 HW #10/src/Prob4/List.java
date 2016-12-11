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
public class List {

    private Node first;

    public List() {
        first = null;
    }

    public int size() {
        int numNode = 0;
        Node current = first;
        while (current != null) {
            numNode++;
            current = current.getNext();
        }
        return numNode;
    }

    public void insertAtFront(DictionaryItem newItem) {
        Node newNode = new Node(newItem, first);
        first = newNode;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void printList() {
        Node curr = first;
        while (curr != null) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }
    }

    public DictionaryItem deleteLast() {
        if (first == null) {
            return null;
        }
        Node current = first;
        Node previous = first;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        if (previous == current) // list has only one node
        {
            first = null;
        } else // list has more than one node
        {
            previous.setNext(null);
        }
        return current.getItem();
    }

}

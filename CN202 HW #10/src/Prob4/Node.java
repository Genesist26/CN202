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
public class Node {

    private DictionaryItem item;
    private Node next;

    // constructor
    public Node(DictionaryItem itemValue, Node nextValue) {
        item = itemValue;
        next = nextValue;
    }
    // get-set methods

    public DictionaryItem getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(DictionaryItem newItem) {
        item = newItem;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }
}

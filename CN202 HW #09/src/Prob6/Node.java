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
public class Node {
    // instance variables

    private int item;
    private int maxItem;
    private Node next;

    // constructor
    public Node(int anItem, int theMaxItem, Node nextValue) {
        item = anItem;
        maxItem = theMaxItem;
        next = nextValue;
    }

    // get-set methods
    public int getItem() {
        return item;
    }

    public int getMaxItem() {
        return maxItem;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(int anItem) {
        item = anItem;
    }

    public void setMaxItem(int theMaxItem) {
        maxItem = theMaxItem;
    }

    public void setNextItem(Node nextValue) {
        next = nextValue;
    }
}

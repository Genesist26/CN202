/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

/**
 *
 * @author Salee
 */
public class SNode {

    private int item;
    private SNode next;
// constructor

    public SNode(int anItem, SNode aNext) {
        item = anItem;
        next = aNext;
    }
// get-set methods

    public int getItem() {
        return item;
    }

    public SNode getNext() {
        return next;
    }

    public void setItem(int newItem) {
        item = newItem;
    }

    public void setNext(SNode newNext) {
        next = newNext;
    }
}

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
public class Snode {

    private int item;
    private Snode next;
// constructor

    public Snode(int anItem, Snode aNext) {
        item = anItem;
        next = aNext;
    }
// get-set methods

    public int getItem() {
        return item;
    }

    public Snode getNext() {
        return next;
    }

    public void setItem(int newItem) {
        item = newItem;
    }

    public void setNext(Snode newNext) {
        next = newNext;
    }
}

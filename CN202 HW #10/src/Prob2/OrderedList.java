/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

/**
 *
 * @author Salee
 */
public class OrderedList {

    private SNode first; // ระบุตําแหน่งของ node แรกของ list
    private int nItems; // บง่ บอกจํานวน node ใน list
    // constructor

    public OrderedList() {
        first = null;
        nItems = 0;
    }
    // methods

    public int size() {
        return nItems;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void removeDuplicates() {
    }
}

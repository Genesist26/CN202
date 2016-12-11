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
public class List {

    private SNode first; // ระบตุ ําแหน่งของnode แรกของ list
// constructor

    public List() {
        first = null;
    }
// methods

    public boolean isEmpty() {
        return (first == null);
    }

    public void append(List aList) {
        if(first == null)
            first = aList.first;
        else
        {
            SNode last = first.getNext();
            while(true)
            {
                if(last.getNext() != null)
                    last = last.getNext();
                else
                    break;
            }
            last.setNext(aList.first);
        }
    }

    public void reverse() {
    }
}

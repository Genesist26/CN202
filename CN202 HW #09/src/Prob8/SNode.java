/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob8;

public class SNode {

    private Object element;
    private SNode next;

    public SNode(Object anElem, SNode aNext) {
        element = anElem;
        next = aNext;
    }

    public Object getElem() {
        return element;
    }

    public SNode getNext() {
        return next;
    }

    public void setElement(Object newElem) {
        element = newElem;
    }

    public void setNext(SNode newNext) {
        next = newNext;
    }
}

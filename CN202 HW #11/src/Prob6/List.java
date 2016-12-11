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
public class List {

    private Snode first; // ระบุตำแหน่งของ node แรกของ list
// constructor

    public List() {
        first = null;
    }

    public void insert(int n) {
        Snode newNode = new Snode(n, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int findSumItemIterative() throws ListEmptyException {
        if (isEmpty()) {
            throw new ListEmptyException("List is empty");
        } else {
            Snode current = first;
            int sum = 0;
            while (current != null) {
                sum += current.getItem();
                current = current.getNext();
                if (current == null) {
                    break;
                }
            }
            return sum;

        }

    }
    
    public int findSumItemRecursion(){
        return findSumItemRecursion(first);
    }
    private int findSumItemRecursion(Snode local){
        if(local == null)
            return 0;
        return local.getItem() + findSumItemRecursion(local.getNext());
    }

    public Snode getNode() {
        return first;
    }

}

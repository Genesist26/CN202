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
public class Dictionary implements DictionaryADT {
    // using an unordered array to store
    // items in the dictionary

    private DictionaryItem[] a;
    private int nItems;

    // implementation of methods & constructors
    public Dictionary(int max) {
        a = new DictionaryItem[max];
        nItems = 0;
    }

    public DictionaryItem find(Object key) {
        for (int j = 0; j < nItems; j++) {
            if (a[j].compareTo(key) == 0) {
                return a[j];
            }
        }
        return null;
    }

    public List findAll(Object key) {
        List list = new List();
        for(int i=0; i<nItems; i++)
        {
            if(a[i].compareTo(key) == 0)
                list.insertAtFront(a[i]);
        }
        
        return list;
    }

    public void insert(DictionaryItem item)
            throws DictionaryFullException {
        if (nItems == a.length) {
            throw new DictionaryFullException("Dictionary is full.");
        }
        a[nItems] = item;
        nItems++;
    }

    public boolean delete(Object key) {
        int j;
        for (j = 0; j < nItems; j++) {
            if (a[j].compareTo(key) == 0) {
                break;
            }
        }
        if (j == nItems) {
            return false;
        } else {
            // item to be deleted is a[j]
            a[j] = a[nItems - 1]; // move the last item to fill the gap
            nItems--;
            return true;
        }
    }

    public List deleteAll(Object key) {
        List result = new List();
        for (int j = 0; j < nItems; j++) {
            if (a[j].compareTo(key) == 0) {  // delete a[j]
                result.insertAtFront(a[j]);
                a[j] = a[nItems - 1];
                j--;
                nItems--;
            }
        }
        return result;
    }

    public void display() {
        for (int j = 0; j < nItems; j++) {
            System.out.println(a[j]);
        }
    }
}


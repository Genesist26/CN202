/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob1;

public class Dictionary implements DictionaryADT {
    // using an unordered array to store items in the dictionary

    private DictionaryItem[] a;
    private int nItems;

    // implementation of methods & constructors
    public Dictionary() {
        int capacity = 10; // initial size of unordered array
        a = new DictionaryItem[capacity];
        nItems = 0;
    }

    public DictionaryItem find(Object key) {
        int j;
        for (j = 0; j < nItems; j++) {
            if (a[j].compareTo(key) == 0) {
                return a[j];
            }
        }
        return null;
    }

    public void insert(DictionaryItem item) {
        if (nItems == a.length) {
            DictionaryItem[] b = new DictionaryItem[a.length * 2];
            for (int i = 0; i < nItems; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        a[nItems++] = item;
    }

    public boolean delete(Object key) {
        boolean del = false;
        int index = 0;
        for(index = 0; index<nItems; index++)
        {
            if(a[index].compareTo(key) == 0)
            {
                del = true;
                if(index == nItems)
                    nItems--;
                else
                {
                    a[index] = a[nItems-1];
                    nItems--;
                }
            }
        }
        return del;
        
        
    }

    public void display() {
        for (int j = 0; j < nItems; j++) {
            System.out.println(a[j]);
        }
    }
}

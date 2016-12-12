/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

import Prob2.*;

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

    /* get the dictionary item with highest key
     return null if the dictionary is empty
     */
    public DictionaryItem getMaxKey() {
        if (nItems == 0) {
            return null;
        }

        DictionaryItem max = a[0];
        for (int i = 1; i < nItems; i++) {
            if (a[i].compareTo(max.getKey()) > 0) {
                max = a[i];
            }
        }
        return max;
    }

    /* remove the item with highest key
     return true if the removal can be done
     return false if the dictionary is empty
     */
    public boolean removeMaxKeyItem()
  {
     if (nItems == 0)
       return false;
     int max = 0;
     for (int i=1; i<nItems; i++)
       if (a[max].compareTo(a[i].getKey()) < 0)
          max = i;
     a[max] = a[nItems-1];
     nItems--;
     return true;
  }

    public void display() {
        for (int j = 0; j < nItems; j++) {
            System.out.println(a[j]);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

import Prob2.*;

public interface DictionaryItem {
    // print information of the dictionary item

    public String toString();

    // return the key of the dictionary item
    public Object getKey();

    // compare the key of this object item with other key
    // returns value >, ==, < 0 if the key of this object is >, ==, < other key
    public int compareTo(Object otherKey);
}

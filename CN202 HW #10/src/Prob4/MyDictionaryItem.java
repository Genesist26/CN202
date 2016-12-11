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
public class MyDictionaryItem implements DictionaryItem {

    private Integer key;
    private String name;

    public MyDictionaryItem(int keyValue, String stringValue) {
        key = keyValue;
        name = stringValue;
    }

    public String toString() {
        return "(" + key.toString() + "," + name + ")";
    }

    public Object getKey() {
        return key;
    }

    public int compareTo(Object otherKey) {
        if (key.intValue() > ((Integer) otherKey).intValue()) {
            return 1;
        } else if (key.intValue() == ((Integer) otherKey).intValue()) {
            return 0;
        } else {
            return -1;
        }
    }

}

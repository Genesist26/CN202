/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2;

public interface DictionaryADT {

    /* find and return the item with the desired key
     return null if not found
     */
    public DictionaryItem find(Object key);

    // insert a dictionary item into the dictionary
    public void insert(DictionaryItem item);

    /* remove the item with the desired key
     return true if the deletion can be done
     return false if the dictionary has no such item
     */
    public boolean delete(Object key);

    // display all items in the dictionary
    public void display();

    /* get the dictionary item with highest key
     return null if the dictionary is empty
     */
    public DictionaryItem getMaxKey();

    /* remove the item with highest key
     return true if the removal can be done
     return false if the dictionary is empty
     */
    public boolean removeMaxKeyItem();
}

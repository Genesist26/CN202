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
public interface DictionaryADT
{
  // find and return the item with the desired key
  // return null if not found
  public DictionaryItem find(Object key);

  // find all items with the desired key
  // return the list of those items in the dictionary
  // return null if no such an item
  public List findAll(Object key);


  // insert a dictionary item into the dictionary
  public void insert(DictionaryItem item);

  // remove the item with the desired key
  // return true if the deletion can be done
  // return false if the dictionary has no such item
  public boolean delete(Object key);


  // remove all items with the desired key
  // create the list containing the all removed items and
  // return the list 
  // return the empty list if the dictionary has so such items
  public List deleteAll(Object key);

  // display all items in the dictionary
  public void display();
}

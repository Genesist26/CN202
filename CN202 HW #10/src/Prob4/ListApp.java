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
public class ListApp {

    public static void main(String[] args) {
        List myList = new List();
        MyDictionaryItem item1 = new MyDictionaryItem(1, "item1");
        myList.insertAtFront(item1);
        MyDictionaryItem item2 = new MyDictionaryItem(2, "item2");
        myList.insertAtFront(item2);
        MyDictionaryItem item3 = new MyDictionaryItem(3, "item3");
        myList.insertAtFront(item3);
        MyDictionaryItem item4 = new MyDictionaryItem(4, "item4");
        myList.insertAtFront(item4);
        System.out.println("Size of myList = " + myList.size());
        myList.printList();

        while (!myList.isEmpty()) {
            MyDictionaryItem deletedItem = (MyDictionaryItem) myList.deleteLast();
            System.out.println("After deleting the last node out of the list");
            myList.printList();
            System.out.println("Deleted item is " + deletedItem);
        }
    }
}

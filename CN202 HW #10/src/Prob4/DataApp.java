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
public class DataApp {

    public static void main(String[] args) {
        int maxSize = 100;
        Dictionary d = new Dictionary(maxSize);

        MyDictionaryItem item2a = new MyDictionaryItem(2, "item2a");
        d.insert(item2a);

        MyDictionaryItem item1 = new MyDictionaryItem(1, "item1");
        d.insert(item1);

        MyDictionaryItem item3a = new MyDictionaryItem(3, "item3a");
        d.insert(item3a);

        MyDictionaryItem item2b = new MyDictionaryItem(2, "item2b");
        d.insert(item2b);

        MyDictionaryItem item3b = new MyDictionaryItem(3, "item3b");
        d.insert(item3b);

        MyDictionaryItem item2c = new MyDictionaryItem(2, "item2c");
        d.insert(item2c);

        System.out.println("After inserting all items, the dictionary contains");
        d.display();

        Integer searchKey = new Integer(1);
        List list1 = d.findAll(searchKey);
        System.out.println("Printing the list contains items with searchKey = " + searchKey.intValue());
        list1.printList();

        searchKey = new Integer(2);
        List list2 = d.findAll(searchKey);
        System.out.println("Printing the list contains items with searchKey = " + searchKey.intValue());
        list2.printList();

        searchKey = new Integer(3);
        List list3 = d.findAll(searchKey);
        System.out.println("Printing the list contains items with searchKey = " + searchKey.intValue());
        list3.printList();

        searchKey = new Integer(2);
        List list4 = d.deleteAll(searchKey);
        System.out.println("After deleting all items with searchKey = " + searchKey.intValue() + ", the dictionary contains");
        d.display();
        System.out.println("Printing the list contains items with searchKey = " + searchKey.intValue());
        list4.printList();

    }
}

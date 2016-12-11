/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

/**
 *
 * @author Salee
 */
public class TestReverseQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(new Integer(4));
        q.insert(new Integer(7));
        q.insert(new Integer(8));
        q.insert(new Integer(3));
        q.insert(new Integer(1));
        q.insert(new Integer(2));

        System.out.println("After reversing the queue: ");
        System.out.println("Contents of q: [front] --> [rear]");
        q.reverseQueue();
        System.out.println(q.isEmpty());
        while (!q.isEmpty()) {
            Integer tempItem = (Integer) q.remove();
            System.out.print(tempItem.intValue() + " ");
        }
        
        System.out.println();

    }
}

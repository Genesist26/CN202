/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

public class StakifyApp {

    public static Stack stackify(Queue q) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        while (!q.isEmpty()) {
            stack1.push(q.remove());
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(new Integer(4));
        q.insert(new Integer(7));
        q.insert(new Integer(8));
        q.insert(new Integer(4));
        q.insert(new Integer(1));
        q.insert(new Integer(2));

        // print all items in queue q
        System.out.println("All items in q from front to rear");
        for (int i = 1; i <= q.size(); i++) {
            Object item = q.remove();
            System.out.print(((Integer) item).intValue() + " ");
            q.insert(item);  // after printing the item, insert it back
        }
        System.out.println();

        Stack s = stackify(q);

        System.out.println("After stackify q");

        // print all items in stack s
        Stack tempStack = new Stack();
        System.out.println("All items in s from top to bottom");
        while (!s.isEmpty()) {
            Object item = s.pop();
            System.out.print(((Integer) item).intValue() + " ");
            tempStack.push(item);
        }
        while (!tempStack.isEmpty()) // push all items back to s
        {
            s.push(tempStack.pop());
        }
        System.out.println();

        if (q.isEmpty()) {
            System.out.println("q is empty");
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author somsa
 */
public class Main {
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.insert(4);
        q.insert(7);
        q.insert(8);
        q.insert(4);
        q.insert(1);
        q.insert(2);
        
        System.out.println("After use replaceInQueue method = ");
        q.replaceInQueue(4, 9);
        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
        
        
    }
}

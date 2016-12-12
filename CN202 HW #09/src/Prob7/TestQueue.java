/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob7;

/**
 *
 * @author somsa
 */
public class TestQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i <= 10; i++) {
            q.insert(new Integer(i));
        }
        while (!q.isEmpty()) {
            Integer intObj = (Integer) q.remove();
            System.out.println(intObj.intValue());
        }

    }
}

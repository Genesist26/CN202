/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob4;

/**
 *
 * @author NALINA
 */
public class TestQ4 {

    public static void main(String[] args) {
        Queue a = new Queue();
        a.insert(4);
        a.insert(7);
        a.insert(8);
        a.insert(3);
        a.insert(1);
        a.insert(2);
        a.replaceInQueue(4, 9);
        while (!a.isEmpty()) {
            System.out.print(a.remove());
        }
    }

}

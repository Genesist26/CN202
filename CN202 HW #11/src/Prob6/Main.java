/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob6;

/**
 *
 * @author somsa
 */
public class Main {

    public static void main(String[] args) {
        List list = new List();
        
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(4);
        list.insert(1);
        
        int sum1 = list.findSumItemIterative();
        System.out.println("sum with Iterative method = "+sum1);
        int sum2 = list.findSumItemRecursion();
        System.out.println("sum with Recursion method = "+sum2);
    }

}

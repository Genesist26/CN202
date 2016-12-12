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
public class Node {
    private Node next;
    private int item;
    
    public Node(int i, Node n){
        next =n ;
        item = i;
    }
    
    public int getItem(){
        return item;
    }
    
    public Node getNext(){
        return next;
    }
}
